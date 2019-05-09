package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]游戏数据源表
**/

@Data
public class QueryGameDataSourceByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -3747339041820339035L;
    @ApiModelProperty(value = "数据源ID" , required = true)
    @NotNull(message = "数据源ID不允许为空")
    private Long sourceId;
}