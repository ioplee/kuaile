package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:20
* @description: [数据库View BEAN]金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -&
**/

@Data
public class OrderBeanTradingVO implements Serializable {

    /**
    *   
    */
    private Long tradingId;
    /**
    *   1 代理商向平台购买金豆 p2b
            2 玩家向代理商购买金豆 b2c
    */
    private Integer tradingType;
    /**
    *   
    */
    private Long sellerId;
    /**
    *   
    */
    private Long buyerId;
    /**
    *   
    */
    private String tradingDate;
    /**
    *   
    */
    private Long beanCounts;
    /**
    *   
    */
    private Long baseCounts;
    /**
    *   
    */
    private Long rebateCounts;
    /**
    *   -1删除 0冻结 1有效
    */
    private Integer infoStatus;
}
