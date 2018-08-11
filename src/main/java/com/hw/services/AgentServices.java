package com.hw.services;

import com.hw.biz.model.OrderDO;
import com.hw.biz.model.UserDO;

import java.util.List;

public interface AgentServices {

    public List<UserDO> findFirstLevelAgent();

    public List<UserDO> findNextLevelAgent(Long userId);

    /**
     * 支付返点
     * @param orderDO
     */
    public void payCommission(OrderDO orderDO);

    /**
     * 计算分红
     * @param userId
     */
    public void payDividend(Long userId);

}
