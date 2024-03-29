package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:26
* @description: [BO query bean]玩家福利列表
**/

@Data
public class QueryBaseLotteryInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -9197659127439943716L;
    @ApiModelProperty(value = "福利ID" , required = true)
    @NotNull(message = "福利ID不允许为空")
    private Long lotteryId;
}