package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]商品表
**/

@Data
public class ModifyOrderGoodsDTO extends ADDOrderGoodsDTO {

    private static final long serialVersionUID = 6244767017601965960L;
    @ApiModelProperty(value = "商品ID" , required = true)
    @NotNull(message = "商品ID不允许为空")
    private Long goodsId;

}