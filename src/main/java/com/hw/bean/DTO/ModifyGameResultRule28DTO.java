package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]游戏开奖结果-三数求和-28
**/

@Data
public class ModifyGameResultRule28DTO extends ADDGameResultRule28DTO {

    private static final long serialVersionUID = -7446596218346536984L;
    @ApiModelProperty(value = "出奖记录ID" , required = true)
    @NotNull(message = "出奖记录ID不允许为空")
    private Long recordId;

}