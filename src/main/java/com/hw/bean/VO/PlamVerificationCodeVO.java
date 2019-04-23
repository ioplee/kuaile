package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-04-24 02:17:20
* @description: [数据库View BEAN]平台验证码
**/

@Data
public class PlamVerificationCodeVO implements Serializable {

    /**
    *   
    */
    private Long codeId;
    /**
    *   1、 注册短信验证码
            2、 找回密码短信验证码
            3、 业务操作
    */
    private Integer codeType;
    /**
    *   当时业务操作时，需要记录当前验证码对应的会员ID
    */
    private Long memberId;
    /**
    *   
    */
    private String mobileNo;
    /**
    *   6位随机数字
    */
    private String codeInfo;
    /**
    *   验证码有效时间（一般发送后有效期为客户端发起时间的5分钟），一期先写死，后续可按业务模块配置相关有效期限时长
    */
    private String limitTime;
    /**
    *   -1 冻结 0 未验证 1已验证
            冻结代表多次验证同一验证码，此验证码失效
            
    */
    private Integer codeStatus;
}
