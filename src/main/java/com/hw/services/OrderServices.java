package com.hw.services;

import com.github.pagehelper.Page;
import com.hw.biz.model.LotteryDO;
import com.hw.biz.model.OrderDO;

import java.util.List;
import java.util.Map;

/**
 * 订单操作
 */
public interface OrderServices {

    public Page<OrderDO> findOrderListByPage(Map<String,String> params, int pageNo, int pageSize);

    public void bet(List<Long> orderIds);

    public void bet(LotteryDO lotteryDO);

}
