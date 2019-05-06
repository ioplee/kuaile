package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:11
* @description: [数据库实体BEAN]会员签到记录表
**/

@Data
public class MemberSigninInfoPO implements Serializable {

    /**
    *   签到记录ID
    */
    private Long infoId;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   签到日期
    */
    private String signinDate;
    /**
    *   签到获得金豆数
    */
    private Integer beanCounts;
    /**
    *   记录状态
    */
    private Integer infoStatus;
}
