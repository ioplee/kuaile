package com.hw.biz.dao;

import com.github.pagehelper.Page;
import com.hw.biz.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderDAO {

    int insert(OrderDO orderDO);

    int update(OrderDO orderDO);

    Page<OrderDO> findOrderByPage();

    OrderDO findOrderById(@Param("id") Long id);

}
