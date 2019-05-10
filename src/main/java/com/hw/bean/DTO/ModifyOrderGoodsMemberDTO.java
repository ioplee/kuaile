package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]玩家购买商品表
**/

@Data
public class ModifyOrderGoodsMemberDTO extends ADDOrderGoodsMemberDTO {

    private static final long serialVersionUID = -2065879072991087024L;
    @ApiModelProperty(value = "交易记录ID" , required = true)
    @NotNull(message = "交易记录ID不允许为空")
    private Long orderId;

}