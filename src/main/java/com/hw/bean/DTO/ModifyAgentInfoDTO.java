package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-07 00:53:29
* @description: [ADD DTO Bean]代理商信息表
**/

@Data
public class ModifyAgentInfoDTO extends ADDAgentInfoDTO {

    private static final long serialVersionUID = 1332159889808013628L;
    @ApiModelProperty(value = "代理商ID" , required = true)
    @NotNull(message = "代理商ID不允许为空")
    private Long agentId;

}