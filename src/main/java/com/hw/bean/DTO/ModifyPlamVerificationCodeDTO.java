package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]验证码记录表
**/

@Data
public class ModifyPlamVerificationCodeDTO extends ADDPlamVerificationCodeDTO {

    private static final long serialVersionUID = -8302618591483324944L;
    @ApiModelProperty(value = "验证码记录ID" , required = true)
    @NotNull(message = "验证码记录ID不允许为空")
    private Long codeId;

}