package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 00:12:28
* @description: [数据库实体BEAN]会员银行账户表
**/

@Data
public class MemberBankcardPO implements Serializable {

    private static final long serialVersionUID = -1057407366294732119L;
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
