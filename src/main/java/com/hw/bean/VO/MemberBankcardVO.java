package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]会员银行账户（平台虚拟银行账户卡）表，用于记录当前用户可用取现或兑换金豆的虚拟货币数值
**/

@Data
public class MemberBankcardVO implements Serializable {

    /**
    *   
    */
    private Long cardId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   用户当前账户余额（整数，平台自动在核算时扣除小数位）
    */
    private Long accountBalance;
    /**
    *   -1 删除 0 冻结 1有效
    */
    private Integer cardStatus;
}
