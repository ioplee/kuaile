package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]开奖数据源记录表
**/

@Data
public class ModifyGameOrgSourceDTO extends ADDGameOrgSourceDTO {

    private static final long serialVersionUID = -7169919877591644327L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long recordId;

}