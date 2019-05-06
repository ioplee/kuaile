package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-07 00:54:06
* @description: [数据库View BEAN]会员银行账户表
**/

@Data
public class MemberBankcardVO implements Serializable {

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
