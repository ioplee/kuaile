package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:13:05
* @description: [数据库View BEAN]会员银行账户明细表
**/

@Data
public class MemberBankcardInfoVO implements Serializable {

    private static final long serialVersionUID = -4249211277731074233L;
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
