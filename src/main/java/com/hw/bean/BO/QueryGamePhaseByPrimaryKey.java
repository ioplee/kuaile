package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]游戏期数信息
**/

@Data
public class QueryGamePhaseByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 2112101908590237801L;
    @ApiModelProperty(value = "游戏期数记录ID" , required = true)
    @NotNull(message = "游戏期数记录ID不允许为空")
    private Long phaseId;
}