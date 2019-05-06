package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:07
* @description: [数据库View BEAN]会员经验兑换金豆记录表
**/

@Data
public class MemberXpToBeanVO implements Serializable {

    /**
    *   兑换记录ID
    */
    private Long exchangeId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   兑换日期
    */
    private String exchangeDate;
    /**
    *   兑换消耗经验值
    */
    private Long xpCounts;
    /**
    *   兑换所得金豆值
    */
    private Long beanCounts;
    /**
    *   记录状态
    */
    private Integer exchangeStatus;
}
