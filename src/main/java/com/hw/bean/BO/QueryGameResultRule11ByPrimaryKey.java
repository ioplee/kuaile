package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]游戏开奖结果-二数求和 11
**/

@Data
public class QueryGameResultRule11ByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6600841764749277950L;
    @ApiModelProperty(value = "出奖记录ID" , required = true)
    @NotNull(message = "出奖记录ID不允许为空")
    private Long recordId;
}