package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 00:13:06
* @description: [数据库View BEAN]用户授信记录表
**/

@Data
public class SecurityTokenVO implements Serializable {

    private static final long serialVersionUID = -3322034757001801706L;
    /**
    *   授信记录ID
    */
    private Long tokenId;
    /**
    *   用户类型
    */
    private Integer userType;
    /**
    *   用户ID
    */
    private Long userId;
    /**
    *   登录账户
    */
    private String account;
    /**
    *   登录时间
    */
    private String loginTime;
    /**
    *   登录ip
    */
    private String loginIp;
    /**
    *   时间戳
    */
    private String loginTimestamp;
    /**
    *   token
    */
    private String tokenContent;
    /**
    *   有效时间
    */
    private Long limitTime;
    /**
    *   记录状态
    */
    private Integer tokenStatus;
}
