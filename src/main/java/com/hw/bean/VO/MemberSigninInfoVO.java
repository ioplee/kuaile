package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:20
* @description: [数据库View BEAN]会员签到记录明细表（签到获取金豆明细表）
**/

@Data
public class MemberSigninInfoVO implements Serializable {

    /**
    *   
    */
    private Long infoId;
    /**
    *   
    */
    private Long memberId;
    /**
    *   
    */
    private String signinDate;
    /**
    *   
    */
    private Integer beanCounts;
    /**
    *   
    */
    private Integer infoStatus;
}
