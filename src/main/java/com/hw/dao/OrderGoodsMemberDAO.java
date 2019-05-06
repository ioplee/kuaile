package com.hw.dao;

import com.hw.bean.BO.QueryOrderGoodsMemberPage;
import com.hw.bean.PO.OrderGoodsMemberPO;
import com.hw.bean.VO.OrderGoodsMemberVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:17
* @description: 玩家购买商品表 DAO 数据库操作对象 Mybatis接口
**/

public interface OrderGoodsMemberDAO{

    /**
    * Insert integer.  添加 玩家购买商品表 记录
    *
    * @param orderGoodsMemberPO  玩家购买商品表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO);

    /**
    * Update integer.  修改玩家购买商品表 记录
    *
    * @param orderGoodsMemberPO  玩家购买商品表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateOrderGoodsMember(OrderGoodsMemberPO orderGoodsMemberPO);

    /**
    * Select list count integer.
    *
    * @param query 获取玩家购买商品表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryOrderGoodsMemberPage query);

    /**
    * Select list list.
    *
    * @param query 获取玩家购买商品表列表记录BO
    * @return the list  返回玩家购买商品表记录集合
    */
    public List<OrderGoodsMemberVO> getPageList(QueryOrderGoodsMemberPage query);

    /**
    * Select by primary key 玩家购买商品表 vo.
    *
    * @param PRI 记录ID
    * @return the OrderGoodsMemberVO  指定 玩家购买商品表 信息VO
    */
    public OrderGoodsMemberVO getOrderGoodsMemberByPrimaryKey(@Param(value="PRI")Long PRI);

}