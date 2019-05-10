package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]会员金豆账户表
**/

@Data
public class ModifyMemberGoldenbaenDTO extends ADDMemberGoldenbaenDTO {

    private static final long serialVersionUID = 1029364235736637411L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long beanId;

}