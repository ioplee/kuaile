package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]游戏数据源表
**/

@Data
public class ModifyGameDataSourceDTO extends ADDGameDataSourceDTO {

    @ApiModelProperty(value = "数据源ID" , required = true)
    @NotNull(message = "数据源ID不允许为空")
    private Long sourceId;

}