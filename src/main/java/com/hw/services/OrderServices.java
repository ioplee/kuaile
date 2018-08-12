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

    public Page<OrderDO> findOrderByPage(Map<String,String> params, int pageNo, int pageSize);

    public List<OrderDO> findOrderByUserId(Long userId);

    /**
     * 根据账期、用户ID计算流水额
     * @param period 账期
     * @param userId 用户ID
     * @return
     */
    public Long calculateFlowNum(Integer period, Long userId);

    /**
     * 根据账期、用户ID计算亏损额
     * @param period 账期
     * @param userId 用户ID
     * @return
     */
    public Long calculateLossNum(Integer period, Long userId);

    /**
     * 根据订单ID列表下注
     * @param orderIds
     */
    public void bet(List<Long> orderIds);

    /**
     * 直接下注
     * @param orderDO
     */
    public void bet(OrderDO orderDO);

    /**
     * 支付回调接口
     * @param orderIds
     * @param paymentChannel
     * @param channelOrderId
     */
    public void payCallback(String orderIds, Integer paymentChannel, String channelOrderId);

}
