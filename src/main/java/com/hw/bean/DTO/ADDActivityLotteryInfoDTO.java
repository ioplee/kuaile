package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]活动-大转盘抽奖记录表
**/

@Data
public class ADDActivityLotteryInfoDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   
    */
    @ApiModelProperty(value = "infoTime" , required = true)
    @NotNull(message = "infoTime不允许为空")
    private String infoTime;
    /**
    *   
    */
    @ApiModelProperty(value = "optionId" , required = true)
    @NotNull(message = "optionId不允许为空")
    private Long optionId;
    /**
    *   
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}