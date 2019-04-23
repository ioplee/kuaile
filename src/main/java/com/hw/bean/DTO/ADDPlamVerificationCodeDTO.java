package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]平台验证码
**/

@Data
public class ADDPlamVerificationCodeDTO implements Serializable {

    /**
    *   1、 注册短信验证码
            2、 找回密码短信验证码
            3、 业务操作
    */
    @ApiModelProperty(value = "codeType" , required = true)
    @NotNull(message = "codeType不允许为空")
    private Integer codeType;
    /**
    *   当时业务操作时，需要记录当前验证码对应的会员ID
    */
    @ApiModelProperty(value = "memberId")
    private Long memberId;
    /**
    *   
    */
    @ApiModelProperty(value = "mobileNo" , required = true)
    @NotNull(message = "mobileNo不允许为空")
    private String mobileNo;
    /**
    *   6位随机数字
    */
    @ApiModelProperty(value = "codeInfo" , required = true)
    @NotNull(message = "codeInfo不允许为空")
    private String codeInfo;
    /**
    *   验证码有效时间（一般发送后有效期为客户端发起时间的5分钟），一期先写死，后续可按业务模块配置相关有效期限时长
    */
    @ApiModelProperty(value = "limitTime" , required = true)
    @NotNull(message = "limitTime不允许为空")
    private String limitTime;
    /**
    *   -1 冻结 0 未验证 1已验证
            冻结代表多次验证同一验证码，此验证码失效
            
    */
    @ApiModelProperty(value = "codeStatus" , required = true)
    @NotNull(message = "codeStatus不允许为空")
    private Integer codeStatus;
}