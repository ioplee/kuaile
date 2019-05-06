package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]会员金豆账户表
**/

@Data
public class MemberGoldenbaenPO implements Serializable {

    /**
    *   记录ID
    */
    private Long beanId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   金豆总数
    */
    private Long beanCount;
    /**
    *   账户状态
    */
    private Integer beanStatus;
}
