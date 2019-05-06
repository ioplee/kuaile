package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]代理商信息表
**/

@Data
public class QueryAgentInfoByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -3258009372262070889L;
    @ApiModelProperty(value = "代理商ID" , required = true)
    @NotNull(message = "代理商ID不允许为空")
    private Long agentId;
}