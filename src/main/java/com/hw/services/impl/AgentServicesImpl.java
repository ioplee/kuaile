package com.hw.services.impl;

import com.hw.biz.dao.AccountTallyDAO;
import com.hw.biz.dao.DetailedDividendDAO;
import com.hw.biz.dao.DividendConfigDAO;
import com.hw.biz.model.*;
import com.hw.services.AgentServices;
import com.hw.services.OrderServices;
import com.hw.services.SystemConfigServices;
import com.hw.services.UserServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AgentServicesImpl implements AgentServices {

    @Resource
    private AccountTallyDAO accountTallyDAO;

    @Resource
    private UserServices userServices;

    @Resource
    private DividendConfigDAO dividendConfigDAO;

    @Resource
    private SystemConfigServices systemConfigServices;

    @Resource
    private OrderServices orderServices;

    @Resource
    private DetailedDividendDAO detailedDividendDAO;

    @Override
    public List<UserDO> findFirstLevelAgent() {
        return null;
    }

    @Override
    public List<UserDO> findNextLevelAgent(Long userId) {
        return null;
    }

    @Override
    public void payCommission(OrderDO orderDO) {
        UserDO userDO = userServices.findUserById(orderDO.getUserId());
        Long commissionNum = orderDO.getAmountBet() * (userDO.getPeiLv() - orderDO.getBetPeiLv());
        AccountTallyDO accountTallyDO = new AccountTallyDO();
        //todo 完成自己返点流水的赋值
        accountTallyDAO.insert(accountTallyDO);
        //支付父节点的返点
        payFatherCommission(userDO.getFatherId(), userDO.getPeiLv(), orderDO.getAmountBet());
    }

    /**
     * 支付父节点返点
     * @param fatherId 父节点ID
     * @param peiLv 当前节点赔率
     * @param amountBet 订单下注额
     */
    private void payFatherCommission(Long fatherId, Integer peiLv, Long amountBet) {
        if(fatherId.equals(new Long(0))) {
            return;
        }
        UserDO userDO = userServices.findUserById(fatherId);
        Long commissionNum = amountBet * (userDO.getPeiLv() - peiLv);
        AccountTallyDO accountTallyDO = new AccountTallyDO();
        //todo 完成返点流水赋值
        accountTallyDAO.insert(accountTallyDO);
        payFatherCommission(userDO.getFatherId(), userDO.getPeiLv(), amountBet);
    }

    @Override
    public void payAllDividend(String period, Long userId) {
        List<UserDO> allAllChildren = userServices.findAllChildrenByUserId(userId);
        Long allFlowNum = 0l;
        Long allBonus = 0l;
        Integer day = systemConfigServices.getDividendDate();
        for(UserDO userDO : allAllChildren) {
            Map<String,String> params = new HashMap<String,String>();
            //todo 查询参数赋值
            List<OrderDO> orderDOList = orderServices.findOrderByParams(params);
            for(OrderDO orderDO : orderDOList) {
                allFlowNum = allFlowNum + orderDO.getAmountBet();
                allBonus = allBonus + orderDO.getWinningJindou();
            }
        }
        Long allLossNum = allFlowNum - allBonus;
        List<DividendConfigDO> dividendConfigDOList = dividendConfigDAO.findDividendConfigListByUserId(userId);
        Integer dividendProportion = 0;
        for(DividendConfigDO one : dividendConfigDOList) {
            if(one.getFlowNum() <= allFlowNum && one.getLossNum() <= allLossNum) {
                if(one.getDividendProportion() > dividendProportion) {
                    dividendProportion = one.getDividendProportion();
                }
            }
        }
        DetailedDividendDO detailedDividendDO = new DetailedDividendDO();
        detailedDividendDO.setUserId(userId);
        detailedDividendDO.setPeriod(period);
        Long dividendNum = allLossNum * dividendProportion / 100;
        detailedDividendDO.setDividendNum(dividendNum);
        detailedDividendDAO.insert(detailedDividendDO);
    }

}
