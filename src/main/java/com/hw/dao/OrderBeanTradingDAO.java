package com.hw.dao;

import com.hw.bean.BO.QueryOrderBeanTradingPage;
import com.hw.bean.VO.OrderBeanTradingVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:44
* @description: 金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& DAO 数据库操作对象 Mybatis接口
**/

public interface OrderBeanTradingDAO{

    /**
    * Insert integer.  添加 金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& 记录
    *
    * @param orderBeanTradingPO  金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertOrderBeanTrading(OrderBeanTradingPO orderBeanTradingPO);

    /**
    * Update integer.  修改金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& 记录
    *
    * @param orderBeanTradingPO  金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateOrderBeanTrading(OrderBeanTradingPO orderBeanTradingPO);

    /**
    * Select list count integer.
    *
    * @param query 获取金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -&列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryOrderBeanTradingPage query);

    /**
    * Select list list.
    *
    * @param query 获取金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -&列表记录BO
    * @return the list  返回金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -&记录集合
    */
    public List<OrderBeanTradingVO> getPageList(QueryOrderBeanTradingPage query);

    /**
    * Select by primary key 金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& vo.
    *
    * @param PRI 记录ID
    * @return the OrderBeanTradingVO  指定 金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -& 信息VO
    */
    public OrderBeanTradingVO getOrderBeanTradingByPrimaryKey(@Param(value = "PRI") Long PRI);

}