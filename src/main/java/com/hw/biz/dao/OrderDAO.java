package com.hw.biz.dao;

import com.github.pagehelper.Page;
import com.hw.biz.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderDAO {

    int insert(OrderDO orderDO);

    int update(OrderDO orderDO);

    Page<OrderDO> findOrderByPage();

    OrderDO findOrderById(@Param("id") Long id);

    List<OrderDO> findOrderByParams(Map<String, String> param);

}
