package com.hw.services;

import com.hw.biz.model.OrderDO;

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

}
