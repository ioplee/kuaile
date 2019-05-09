package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:28
* @description: [BO query bean]玩家购买商品表
**/

@Data
public class QueryOrderGoodsMemberByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 8882848168618720417L;
    @ApiModelProperty(value = "交易记录ID" , required = true)
    @NotNull(message = "交易记录ID不允许为空")
    private Long orderId;
}