package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]玩家投注表
**/

@Data
public class ModifyGamePlayerBettingDTO extends ADDGamePlayerBettingDTO {

    private static final long serialVersionUID = -702531997686712978L;
    @ApiModelProperty(value = "投注记录ID" , required = true)
    @NotNull(message = "投注记录ID不允许为空")
    private Long bettingId;

}