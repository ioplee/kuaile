package com.hw.dao;

import com.hw.bean.BO.QueryOrderGoodsMemberPage;
import com.hw.bean.PO.OrderGoodsMemberPO;
import com.hw.bean.VO.OrderGoodsMemberVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description:  DAO 数据库操作对象 Mybatis接口
**/

public interface OrderGoodsMemberDAO{

    /**
    * Insert integer.  添加  记录
    *
    * @param orderGoodsMemberPO   数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO);

    /**
    * Update integer.  修改 记录
    *
    * @param orderGoodsMemberPO   数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO);

    /**
    * Select list count integer.
    *
    * @param query 获取列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryOrderGoodsMemberPage query);

    /**
    * Select list list.
    *
    * @param query 获取列表记录BO
    * @return the list  返回记录集合
    */
    public List<OrderGoodsMemberVO> getPageList(QueryOrderGoodsMemberPage query);

    /**
    * Select by primary key  vo.
    *
    * @param PRI 记录ID
    * @return the OrderGoodsMemberVO  指定  信息VO
    */
    public OrderGoodsMemberVO getOrderGoodsMemberByPrimaryKey(@Param(value = "PRI") Long PRI);

}