package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]会员经验兑换金豆记录表
**/

@Data
public class ADDMemberXpToBeanDTO implements Serializable {

    /**
    *   会员ID
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   兑换日期
    */
    @ApiModelProperty(value = "exchangeDate" , required = true)
    @NotNull(message = "exchangeDate不允许为空")
    private String exchangeDate;
    /**
    *   兑换消耗经验值
    */
    @ApiModelProperty(value = "xpCounts" , required = true)
    @NotNull(message = "xpCounts不允许为空")
    private Long xpCounts;
    /**
    *   兑换所得金豆值
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "exchangeStatus" , required = true)
    @NotNull(message = "exchangeStatus不允许为空")
    private Integer exchangeStatus;
}