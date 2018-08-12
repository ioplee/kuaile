package com.hw.services.impl;

import com.hw.biz.dao.AccountTallyDAO;
import com.hw.biz.dao.UserDAO;
import com.hw.biz.model.AccountTallyDO;
import com.hw.biz.model.OrderDO;
import com.hw.biz.model.UserDO;
import com.hw.services.AgentServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AgentServicesImpl implements AgentServices {

    @Resource
    private UserDAO userDAO;

    @Resource
    private AccountTallyDAO accountTallyDAO;

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
        UserDO userDO = userDAO.findUserById(orderDO.getUserId());
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
        UserDO userDO = userDAO.findUserById(fatherId);
        Long commissionNum = amountBet * (userDO.getPeiLv() - peiLv);
        AccountTallyDO accountTallyDO = new AccountTallyDO();
        //todo 完成返点流水赋值
        accountTallyDAO.insert(accountTallyDO);
        payFatherCommission(userDO.getFatherId(), userDO.getPeiLv(), amountBet);
    }

    @Override
    public void payDividend(Integer period, Long userId) {

    }

}
