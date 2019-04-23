package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:25
* @description: [ADD DTO Bean]代理商金豆明细表
**/

@Data
public class ModifyAgentGoldenbeanInfoDTO extends ADDAgentGoldenbeanInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long infoId;

}