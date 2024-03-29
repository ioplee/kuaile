package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]会员经验兑换金豆记录表
**/

@Data
public class QueryMemberXpToBeanByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -9110022270856972791L;
    @ApiModelProperty(value = "兑换记录ID" , required = true)
    @NotNull(message = "兑换记录ID不允许为空")
    private Long exchangeId;
}