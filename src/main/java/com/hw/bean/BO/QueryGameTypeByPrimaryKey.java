package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]游戏类型表
**/

@Data
public class QueryGameTypeByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "类型ID" , required = true)
    @NotNull(message = "类型ID不允许为空")
    private Long typeId;
}