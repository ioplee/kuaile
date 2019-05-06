package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:30
* @description: [ADD DTO Bean]游戏类型表
**/

@Data
public class ModifyGameTypeDTO extends ADDGameTypeDTO {

    private static final long serialVersionUID = -5036348572752627970L;
    @ApiModelProperty(value = "类型ID" , required = true)
    @NotNull(message = "类型ID不允许为空")
    private Long typeId;

}