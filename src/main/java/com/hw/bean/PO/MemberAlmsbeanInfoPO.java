package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]会员每日救济金豆领取记录表
**/

@Data
public class MemberAlmsbeanInfoPO implements Serializable {

    /**
    *   领取记录ID
    */
    private Long infoId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   领取日期
    */
    private String getDate;
    /**
    *   领取救济金豆数
    */
    private Long beanCounts;
    /**
    *   记录状态
    */
    private Integer infoStatus;
}
