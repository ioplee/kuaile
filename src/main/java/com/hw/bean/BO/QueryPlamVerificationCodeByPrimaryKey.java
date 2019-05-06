package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]验证码记录表
**/

@Data
public class QueryPlamVerificationCodeByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -8017699408244667338L;
    @ApiModelProperty(value = "验证码记录ID" , required = true)
    @NotNull(message = "验证码记录ID不允许为空")
    private Long codeId;
}