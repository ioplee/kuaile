package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-04-24 02:17:19
* @description: [数据库View BEAN]会员金豆表，用于记录会员当前可使用金豆（注意此表不是金豆明细，仅为会员当前可用金豆）
**/

@Data
public class MemberGoldenbaenVO implements Serializable {

    /**
    *   
    */
    private Long beanId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   会员当前金豆可用数值（整数）
    */
    private Long beanCount;
    /**
    *   -1 删除 0 冻结 1有效
    */
    private Integer beanStatus;
}
