package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:37
* @description: [BO query bean]大转盘配置表
**/

@Data
public class QueryActivityLotteryByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -7794895885873317821L;
    @ApiModelProperty(value = "奖项ID" , required = true)
    @NotNull(message = "奖项ID不允许为空")
    private Long itemId;
}