package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:29
* @description: [ADD DTO Bean]代理商金豆表
**/

@Data
public class ModifyAgentGoldenbeanDTO extends ADDAgentGoldenbeanDTO {

    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;

}