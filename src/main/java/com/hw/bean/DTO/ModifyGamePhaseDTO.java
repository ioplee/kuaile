package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]游戏期数信息
**/

@Data
public class ModifyGamePhaseDTO extends ADDGamePhaseDTO {

    private static final long serialVersionUID = 9131716170604251944L;
    @ApiModelProperty(value = "游戏期数记录ID" , required = true)
    @NotNull(message = "游戏期数记录ID不允许为空")
    private Long phaseId;

}