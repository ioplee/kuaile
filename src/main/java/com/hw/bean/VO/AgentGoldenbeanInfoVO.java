package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]代理商金豆明细表
**/

@Data
public class AgentGoldenbeanInfoVO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long agentId;
    /**
    *   1 购买金豆（从平台购买金豆）加金豆
            2 向用户售卖金豆  减金豆
            3 商品出售给平台  加金豆
    */
    private Integer infoType;
    /**
    *   本次业务记录对应的金豆总数
    */
    private Long beanCounts;
    /**
    *   
    */
    private Long bizId;
    /**
    *   
    */
    private Integer infoStatus;
    /**
    *   
    */
    private Long baseCounts;
    /**
    *   1、 向平台购买金豆时，此字段记录赠送的金豆数
            2、 向平台出售礼品卡时，返点金豆数
    */
    private Long rebateCounts;
}
