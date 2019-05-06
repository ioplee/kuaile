package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]商品表
**/

@Data
public class QueryOrderGoodsByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "商品ID" , required = true)
    @NotNull(message = "商品ID不允许为空")
    private Long goodsId;
}