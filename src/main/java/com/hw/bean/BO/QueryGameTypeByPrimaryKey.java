package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]游戏类型表
**/

@Data
public class QueryGameTypeByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -4134850571637970574L;
    @ApiModelProperty(value = "类型ID" , required = true)
    @NotNull(message = "类型ID不允许为空")
    private Long typeId;
}