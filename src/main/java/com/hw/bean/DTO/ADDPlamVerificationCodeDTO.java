package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:19
* @description: [ADD DTO Bean]验证码记录表
**/

@Data
public class ADDPlamVerificationCodeDTO implements Serializable {

    private static final long serialVersionUID = 7300749483264176930L;
    /**
    *   业务类型
    */
    @ApiModelProperty(value = "codeType" , required = true)
    @NotNull(message = "codeType不允许为空")
    private Integer codeType;
    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId")
    private Long memberId;
    /**
    *   手机号码
    */
    @ApiModelProperty(value = "mobileNo" , required = true)
    @NotNull(message = "mobileNo不允许为空")
    private String mobileNo;
    /**
    *   验证码
    */
    @ApiModelProperty(value = "codeInfo" , required = true)
    @NotNull(message = "codeInfo不允许为空")
    private String codeInfo;
    /**
    *   有效期限
    */
    @ApiModelProperty(value = "limitTime" , required = true)
    @NotNull(message = "limitTime不允许为空")
    private String limitTime;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "codeStatus" , required = true)
    @NotNull(message = "codeStatus不允许为空")
    private Integer codeStatus;
}