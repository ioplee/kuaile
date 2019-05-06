package com.hw.dao;

import com.hw.bean.BO.QueryOrderGoodsPage;
import com.hw.bean.PO.OrderGoodsPO;
import com.hw.bean.VO.OrderGoodsVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:17
* @description: 商品表 DAO 数据库操作对象 Mybatis接口
**/

public interface OrderGoodsDAO{

    /**
    * Insert integer.  添加 商品表 记录
    *
    * @param orderGoodsPO  商品表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertOrderGoods(OrderGoodsPO orderGoodsPO);

    /**
    * Update integer.  修改商品表 记录
    *
    * @param orderGoodsPO  商品表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateOrderGoods(OrderGoodsPO orderGoodsPO);

    /**
    * Select list count integer.
    *
    * @param query 获取商品表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryOrderGoodsPage query);

    /**
    * Select list list.
    *
    * @param query 获取商品表列表记录BO
    * @return the list  返回商品表记录集合
    */
    public List<OrderGoodsVO> getPageList(QueryOrderGoodsPage query);

    /**
    * Select by primary key 商品表 vo.
    *
    * @param PRI 记录ID
    * @return the OrderGoodsVO  指定 商品表 信息VO
    */
    public OrderGoodsVO getOrderGoodsByPrimaryKey(@Param(value="PRI")Long PRI);

}