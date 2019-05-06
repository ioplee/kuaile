package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:19
* @description: [ADD DTO Bean]用户授信记录表
**/

@Data
public class ADDSecurityTokenDTO implements Serializable {

    private static final long serialVersionUID = 7721696447587175740L;
    /**
    *   用户类型
    */
    @ApiModelProperty(value = "userType" , required = true)
    @NotNull(message = "userType不允许为空")
    private Integer userType;
    /**
    *   用户ID
    */
    @ApiModelProperty(value = "userId" , required = true)
    @NotNull(message = "userId不允许为空")
    private Long userId;
    /**
    *   登录账户
    */
    @ApiModelProperty(value = "account" , required = true)
    @NotNull(message = "account不允许为空")
    private String account;
    /**
    *   登录时间
    */
    @ApiModelProperty(value = "loginTime" , required = true)
    @NotNull(message = "loginTime不允许为空")
    private String loginTime;
    /**
    *   登录ip
    */
    @ApiModelProperty(value = "loginIp" , required = true)
    @NotNull(message = "loginIp不允许为空")
    private String loginIp;
    /**
    *   时间戳
    */
    @ApiModelProperty(value = "loginTimestamp" , required = true)
    @NotNull(message = "loginTimestamp不允许为空")
    private String loginTimestamp;
    /**
    *   token
    */
    @ApiModelProperty(value = "tokenContent" , required = true)
    @NotNull(message = "tokenContent不允许为空")
    private String tokenContent;
    /**
    *   有效时间
    */
    @ApiModelProperty(value = "limitTime" , required = true)
    @NotNull(message = "limitTime不允许为空")
    private Long limitTime;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "tokenStatus" , required = true)
    @NotNull(message = "tokenStatus不允许为空")
    private Integer tokenStatus;
}