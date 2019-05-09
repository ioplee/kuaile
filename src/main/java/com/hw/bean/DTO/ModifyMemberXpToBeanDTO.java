package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]会员经验兑换金豆记录表
**/

@Data
public class ModifyMemberXpToBeanDTO extends ADDMemberXpToBeanDTO {

    @ApiModelProperty(value = "兑换记录ID" , required = true)
    @NotNull(message = "兑换记录ID不允许为空")
    private Long exchangeId;

}