package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]游戏信息表
**/

@Data
public class QueryGameInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 5104444858498794369L;
    @ApiModelProperty(value = "游戏ID" , required = true)
    @NotNull(message = "游戏ID不允许为空")
    private Long gameId;
}