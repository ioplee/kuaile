package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]游戏信息表
**/

@Data
public class ModifyGameInfoDTO extends ADDGameInfoDTO {

    @ApiModelProperty(value = "游戏ID" , required = true)
    @NotNull(message = "游戏ID不允许为空")
    private Long gameId;

}