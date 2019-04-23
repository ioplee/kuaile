package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:31:31
* @description: [BO query bean]金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -&
**/

@Data
public class QueryOrderBeanTradingByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long tradingId;
}