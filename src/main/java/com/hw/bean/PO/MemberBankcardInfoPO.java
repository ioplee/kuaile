package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:12:28
* @description: [数据库实体BEAN]会员银行账户明细表
**/

@Data
public class MemberBankcardInfoPO implements Serializable {

    /**
    *   明细ID
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
    *   现金金额
    */
    private Long infoFee;
    /**
    *   业务记录ID
    */
    private Long bizId;
    /**
    *   记录状态
    */
    private Integer infoStatus;
}
