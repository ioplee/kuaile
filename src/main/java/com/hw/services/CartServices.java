package com.hw.services;

import com.github.pagehelper.Page;
import com.hw.biz.model.OrderDO;

import java.util.Map;

/**
 * 购物车操作
 */
public interface CartServices {

    /**
     *
     * @param orderDO
     */
    public void addOrder(OrderDO orderDO);

    /**
     *
     * @param id
     */
    public void removeOrder(Long id);

    public Page<OrderDO> findCartOrderListByPage(Map<String,String> params, int pageNo, int pageSize);

}
