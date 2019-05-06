package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:31
* @description: [ADD DTO Bean]验证码记录表
**/

@Data
public class ModifyPlamVerificationCodeDTO extends ADDPlamVerificationCodeDTO {

    @ApiModelProperty(value = "验证码记录ID" , required = true)
    @NotNull(message = "验证码记录ID不允许为空")
    private Long codeId;

}