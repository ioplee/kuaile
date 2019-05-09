package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]游戏开奖结果-三数求和-28
**/

@Data
public class QueryGameResultRule28ByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6515644122278147009L;
    @ApiModelProperty(value = "出奖记录ID" , required = true)
    @NotNull(message = "出奖记录ID不允许为空")
    private Long recordId;
}