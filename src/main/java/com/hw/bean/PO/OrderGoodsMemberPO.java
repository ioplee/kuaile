package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:11
* @description: [数据库实体BEAN]玩家购买商品表
**/

@Data
public class OrderGoodsMemberPO implements Serializable {

    private static final long serialVersionUID = -7446092510246071801L;
    /**
    *   交易记录ID
    */
    private Long orderId;
    /**
    *   玩家ID
    */
    private Long memberId;
    /**
    *   商品ID
    */
    private Long goodsId;
    /**
    *   购买订单金豆总数
    */
    private Long beanTotal;
    /**
    *   购买订单金豆数
    */
    private Long beanBase;
    /**
    *   购买订单手续费
    */
    private Long beanRebate;
    /**
    *   购买交易时间
    */
    private String orderDate;
    /**
    *   订单状态
    */
    private Integer orderStatus;
    /**
    *   受让代理商ID
    */
    private Long agentId;
    /**
    *   受让日期
    */
    private String grantDate;
    /**
    *   受让金豆数
    */
    private Long grantBean;
    /**
    *   受让佣金
    */
    private Long grantRebate;
    /**
    *   回购日期
    */
    private String buyBackDate;
    /**
    *   回购金豆数
    */
    private Long buyBackBean;
}
