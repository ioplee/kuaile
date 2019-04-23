package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]金豆交易订单表，包含两部分数据：
1、 平台出售给代理商金豆
2、 代理商出售给玩家金豆
                                       -&
**/

@Data
public class ADDOrderBeanTradingDTO implements Serializable {

    /**
    *   1 代理商向平台购买金豆 p2b
            2 玩家向代理商购买金豆 b2c
    */
    @ApiModelProperty(value = "tradingType" , required = true)
    @NotNull(message = "tradingType不允许为空")
    private Integer tradingType;
    /**
    *   
    */
    @ApiModelProperty(value = "sellerId" , required = true)
    @NotNull(message = "sellerId不允许为空")
    private Long sellerId;
    /**
    *   
    */
    @ApiModelProperty(value = "buyerId" , required = true)
    @NotNull(message = "buyerId不允许为空")
    private Long buyerId;
    /**
    *   
    */
    @ApiModelProperty(value = "tradingDate" , required = true)
    @NotNull(message = "tradingDate不允许为空")
    private String tradingDate;
    /**
    *   
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "baseCounts" , required = true)
    @NotNull(message = "baseCounts不允许为空")
    private Long baseCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "rebateCounts" , required = true)
    @NotNull(message = "rebateCounts不允许为空")
    private Long rebateCounts;
    /**
    *   -1删除 0冻结 1有效
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}