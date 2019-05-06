package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]游戏开奖结果-群数第一位 10
**/

@Data
public class QueryGameResultRule10ByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 6768011558884339067L;
    @ApiModelProperty(value = "出奖记录ID" , required = true)
    @NotNull(message = "出奖记录ID不允许为空")
    private Long recordId;
}