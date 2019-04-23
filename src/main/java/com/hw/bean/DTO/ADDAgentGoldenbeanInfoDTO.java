package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]代理商金豆明细表
**/

@Data
public class ADDAgentGoldenbeanInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "agentId" , required = true)
    @NotNull(message = "agentId不允许为空")
    private Long agentId;
    /**
    *   1 购买金豆（从平台购买金豆）加金豆
            2 向用户售卖金豆  减金豆
            3 商品出售给平台  加金豆
    */
    @ApiModelProperty(value = "infoType" , required = true)
    @NotNull(message = "infoType不允许为空")
    private Integer infoType;
    /**
    *   本次业务记录对应的金豆总数
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "bizId" , required = true)
    @NotNull(message = "bizId不允许为空")
    private Long bizId;
    /**
    *   
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
    /**
    *   
    */
    @ApiModelProperty(value = "baseCounts" , required = true)
    @NotNull(message = "baseCounts不允许为空")
    private Long baseCounts;
    /**
    *   1、 向平台购买金豆时，此字段记录赠送的金豆数
            2、 向平台出售礼品卡时，返点金豆数
    */
    @ApiModelProperty(value = "rebateCounts" , required = true)
    @NotNull(message = "rebateCounts不允许为空")
    private Long rebateCounts;
}