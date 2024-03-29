package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:04
* @description: [ADD DTO Bean]代理商金豆明细表
**/

@Data
public class ModifyAgentGoldenbeanInfoDTO extends ADDAgentGoldenbeanInfoDTO {

    private static final long serialVersionUID = 4733433794065873976L;
    @ApiModelProperty(value = "明细记录ID" , required = true)
    @NotNull(message = "明细记录ID不允许为空")
    private Long infoId;

}