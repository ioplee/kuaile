package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:37
* @description: [BO query bean]大转盘获奖记录表
**/

@Data
public class QueryActivityLotteryInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 5568352559495792698L;
    @ApiModelProperty(value = "中奖记录ID" , required = true)
    @NotNull(message = "中奖记录ID不允许为空")
    private Long infoId;
}