package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-07 00:49:10
* @description: [数据库实体BEAN]会员金豆账户明细表
**/

@Data
public class MemberGoldenbeanInfoPO implements Serializable {

    /**
    *   明细记录ID
    */
    private Long infoId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   明细类型
    */
    private Integer infoType;
    /**
    *   金豆数值
    */
    private Long benaCounts;
    /**
    *   业务记录ID
    */
    private Long bizId;
    /**
    *   记录状态
    */
    private Integer infpStatus;
}
