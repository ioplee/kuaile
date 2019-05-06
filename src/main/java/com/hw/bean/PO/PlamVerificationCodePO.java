package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:49:11
* @description: [数据库实体BEAN]验证码记录表
**/

@Data
public class PlamVerificationCodePO implements Serializable {

    private static final long serialVersionUID = -1244805312582028349L;
    /**
    *   验证码记录ID
    */
    private Long codeId;
    /**
    *   业务类型
    */
    private Integer codeType;
    /**
    *   会员ID
    */
    private Long memberId;
    /**
    *   手机号码
    */
    private String mobileNo;
    /**
    *   验证码
    */
    private String codeInfo;
    /**
    *   有效期限
    */
    private String limitTime;
    /**
    *   记录状态
    */
    private Integer codeStatus;
}
