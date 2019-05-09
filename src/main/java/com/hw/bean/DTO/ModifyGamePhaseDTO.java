package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]游戏期数信息
**/

@Data
public class ModifyGamePhaseDTO extends ADDGamePhaseDTO {

    @ApiModelProperty(value = "游戏期数记录ID" , required = true)
    @NotNull(message = "游戏期数记录ID不允许为空")
    private Long phaseId;

}