package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:19
* @description: [ADD DTO Bean]会员经验值兑换金豆记录明细表
**/

@Data
public class ADDMemberXpToBeanDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "memberId" , required = true)
    @NotNull(message = "memberId不允许为空")
    private Long memberId;
    /**
    *   
    */
    @ApiModelProperty(value = "exchangeDate" , required = true)
    @NotNull(message = "exchangeDate不允许为空")
    private String exchangeDate;
    /**
    *   
    */
    @ApiModelProperty(value = "xpCounts" , required = true)
    @NotNull(message = "xpCounts不允许为空")
    private Long xpCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   
    */
    @ApiModelProperty(value = "exchangeStatus" , required = true)
    @NotNull(message = "exchangeStatus不允许为空")
    private Integer exchangeStatus;
}