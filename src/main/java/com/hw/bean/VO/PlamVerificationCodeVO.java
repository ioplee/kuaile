package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-07 00:54:07
* @description: [数据库View BEAN]验证码记录表
**/

@Data
public class PlamVerificationCodeVO implements Serializable {

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
