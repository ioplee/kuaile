package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-04-24 02:36:25
* @description: [ADD DTO Bean]平台代理商信息
**/

@Data
public class ModifyAgentInfoDTO extends ADDAgentInfoDTO {

    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long agentId;

}