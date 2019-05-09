package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]商品表
**/

@Data
public class QueryOrderGoodsByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 4421430985362576233L;
    @ApiModelProperty(value = "商品ID" , required = true)
    @NotNull(message = "商品ID不允许为空")
    private Long goodsId;
}