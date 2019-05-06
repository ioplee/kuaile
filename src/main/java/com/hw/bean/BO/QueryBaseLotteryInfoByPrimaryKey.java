package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]玩家福利列表
**/

@Data
public class QueryBaseLotteryInfoByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "福利ID" , required = true)
    @NotNull(message = "福利ID不允许为空")
    private Long lotteryId;
}