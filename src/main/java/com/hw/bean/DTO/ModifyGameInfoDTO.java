package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]游戏信息表
**/

@Data
public class ModifyGameInfoDTO extends ADDGameInfoDTO {

    private static final long serialVersionUID = -5814423641353797484L;
    @ApiModelProperty(value = "游戏ID" , required = true)
    @NotNull(message = "游戏ID不允许为空")
    private Long gameId;

}