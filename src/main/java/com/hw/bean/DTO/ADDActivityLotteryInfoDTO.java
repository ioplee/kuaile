package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:17
* @description: [ADD DTO Bean]大转盘获奖记录表
**/

@Data
public class ADDActivityLotteryInfoDTO implements Serializable {

    private static final long serialVersionUID = -2999175403397994218L;
    /**
    *   中奖会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   中奖时间
    */
    @ApiModelProperty(value = "infoTime" , required = true)
    @NotNull(message = "infoTime不允许为空")
    private String infoTime;
    /**
    *   中奖奖项ID
    */
    @ApiModelProperty(value = "optionId" , required = true)
    @NotNull(message = "optionId不允许为空")
    private Long optionId;
    /**
    *   中奖金豆
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}