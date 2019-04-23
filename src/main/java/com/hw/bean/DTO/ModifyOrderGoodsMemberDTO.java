package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:26
* @description: [ADD DTO Bean]
**/

@Data
public class ModifyOrderGoodsMemberDTO extends ADDOrderGoodsMemberDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long orderId;

}