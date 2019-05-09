package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]游戏类型表
**/

@Data
public class ModifyGameTypeDTO extends ADDGameTypeDTO {

    @ApiModelProperty(value = "类型ID" , required = true)
    @NotNull(message = "类型ID不允许为空")
    private Long typeId;

}