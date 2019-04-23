package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-04-24 02:16:14
* @description: [数据库实体BEAN]会员虚拟银行账户明细记录表，
记录类型（来源）为：
1、 购买商品 消耗账户余额 减余额
                                         -&
**/

@Data
public class MemberBankcardInfoPO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   1、 购买商品 消耗账户余额 减余额
            2、 金豆转银行账户  加余额
            3、 现金转金豆 减余额
    */
    private Integer infoType;
    /**
    *   
    */
    private Long infoFee;
    /**
    *   
    */
    private Long bizId;
    /**
    *   -1 删除 0 停用、冻结 1 有效记录
    */
    private Integer infoStatus;
}
