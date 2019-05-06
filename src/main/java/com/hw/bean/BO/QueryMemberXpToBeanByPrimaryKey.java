package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]会员经验兑换金豆记录表
**/

@Data
public class QueryMemberXpToBeanByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "兑换记录ID" , required = true)
    @NotNull(message = "兑换记录ID不允许为空")
    private Long exchangeId;
}