package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]游戏开奖结果-三数求和-16
**/

@Data
public class ModifyGameResultRule29DTO extends ADDGameResultRule29DTO {

    private static final long serialVersionUID = 2901555317987026620L;
    @ApiModelProperty(value = "出奖记录ID" , required = true)
    @NotNull(message = "出奖记录ID不允许为空")
    private Long recordId;

}