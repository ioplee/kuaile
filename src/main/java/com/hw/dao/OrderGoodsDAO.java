package com.hw.dao;

import com.hw.bean.BO.QueryOrderGoodsPage;
import com.hw.bean.VO.OrderGoodsVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description: 平台商品表（用于金豆和资金转换） DAO 数据库操作对象 Mybatis接口
**/

public interface OrderGoodsDAO{

    /**
    * Insert integer.  添加 平台商品表（用于金豆和资金转换） 记录
    *
    * @param orderGoodsPO  平台商品表（用于金豆和资金转换） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertOrderGoods(OrderGoodsPO orderGoodsPO);

    /**
    * Update integer.  修改平台商品表（用于金豆和资金转换） 记录
    *
    * @param orderGoodsPO  平台商品表（用于金豆和资金转换） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateOrderGoods(OrderGoodsPO orderGoodsPO);

    /**
    * Select list count integer.
    *
    * @param query 获取平台商品表（用于金豆和资金转换）列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryOrderGoodsPage query);

    /**
    * Select list list.
    *
    * @param query 获取平台商品表（用于金豆和资金转换）列表记录BO
    * @return the list  返回平台商品表（用于金豆和资金转换）记录集合
    */
    public List<OrderGoodsVO> getPageList(QueryOrderGoodsPage query);

    /**
    * Select by primary key 平台商品表（用于金豆和资金转换） vo.
    *
    * @param PRI 记录ID
    * @return the OrderGoodsVO  指定 平台商品表（用于金豆和资金转换） 信息VO
    */
    public OrderGoodsVO getOrderGoodsByPrimaryKey(@Param(value = "PRI") Long PRI);

}