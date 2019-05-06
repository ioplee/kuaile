package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]玩家投注表
**/

@Data
public class ModifyGamePlayerBettingDTO extends ADDGamePlayerBettingDTO {

    @ApiModelProperty(value = "投注记录ID" , required = true)
    @NotNull(message = "投注记录ID不允许为空")
    private Long bettingId;

}