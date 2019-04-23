package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]
**/

@Data
public class OrderGoodsMemberPO implements Serializable {

    /**
    *   
    */
    private Long orderId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   
    */
    private Long goodsId;
    /**
    *   订单总金豆数
            
    */
    private Long beanTotal;
    /**
    *   订单中商品所值金豆数
    */
    private Long beanBase;
    /**
    *   订单平台抽佣金豆数
    */
    private Long beanRebate;
    /**
    *   
    */
    private String orderDate;
    /**
    *   -1冻结 0 购买 1已出售（转手代理商） 2平台回购
    */
    private Integer orderStatus;
    /**
    *   
    */
    private Long agentId;
    /**
    *   
    */
    private String grantDate;
    /**
    *   
    */
    private Long grantBean;
    /**
    *   
    */
    private Long grantRebate;
    /**
    *   
    */
    private String buyBackDate;
    /**
    *   
    */
    private Long buyBackBean;
}
