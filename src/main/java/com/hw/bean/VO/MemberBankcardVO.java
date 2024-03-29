package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:13:05
* @description: [数据库View BEAN]会员银行账户表
**/

@Data
public class MemberBankcardVO implements Serializable {

    private static final long serialVersionUID = 7427812578706763302L;
    /**
    *   卡ID
    */
    private Long cardId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   存款金额
    */
    private Long accountBalance;
    /**
    *   银行账户状态
    */
    private Integer cardStatus;
}
