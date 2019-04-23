package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]大转盘定义表
**/

@Data
public class ADDActivityLotteryDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "itemTitle" , required = true)
    @NotNull(message = "itemTitle不允许为空")
    private String itemTitle;
    /**
    *   
    */
    @ApiModelProperty(value = "itemImgUrl" , required = true)
    @NotNull(message = "itemImgUrl不允许为空")
    private String itemImgUrl;
    /**
    *   
    */
    @ApiModelProperty(value = "itemBeanCounts" , required = true)
    @NotNull(message = "itemBeanCounts不允许为空")
    private Long itemBeanCounts;
    /**
    *   中奖几率 0-100,0表示不会中，100代表肯定中
    */
    @ApiModelProperty(value = "itemProbability" , required = true)
    @NotNull(message = "itemProbability不允许为空")
    private Integer itemProbability;
    /**
    *   -1 删除 0停用 1有效
    */
    @ApiModelProperty(value = "itemStatus" , required = true)
    @NotNull(message = "itemStatus不允许为空")
    private Integer itemStatus;
}