package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-04-24 02:32:18
* @description: [ADD DTO Bean]代理商金豆信息表
**/

@Data
public class ADDAgentGoldenbeanDTO implements Serializable {

    /**
    *   
    */
    @ApiModelProperty(value = "agentId" , required = true)
    @NotNull(message = "agentId不允许为空")
    private Long agentId;
    /**
    *   
    */
    @ApiModelProperty(value = "beanCounts" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   -1删除 0冻结停用 1有效
    */
    @ApiModelProperty(value = "agentStatus" , required = true)
    @NotNull(message = "agentStatus不允许为空")
    private Integer agentStatus;
}