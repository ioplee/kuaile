package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]会员经验值兑换金豆记录明细表
**/

@Data
public class MemberXpToBeanPO implements Serializable {

    /**
    *   
    */
    private Long exchangeId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   
    */
    private String exchangeDate;
    /**
    *   
    */
    private Long xpCounts;
    /**
    *   
    */
    private Long beanCounts;
    /**
    *   
    */
    private Integer exchangeStatus;
}
