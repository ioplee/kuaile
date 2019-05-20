package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:51
* @description: [ADD DTO Bean]代理商金豆表
**/

@Data
public class ADDAgentGoldenbeanDTO implements Serializable {

    private static final long serialVersionUID = -3629708365121802036L;
    /**
    *   代理商ID
    */
    @ApiModelProperty(value = "agentId 代理商ID" , required = true)
    @NotNull(message = "agentId不允许为空")
    private Long agentId;
    /**
    *   金豆数
    */
    @ApiModelProperty(value = "beanCounts 上分(金豆)数值 必须为整数" , required = true)
    @NotNull(message = "beanCounts不允许为空")
    private Long beanCounts;
    /**
    *   账户状态
    */
    @ApiModelProperty(value = "agentStatus 1有效 0停用 -1删除" , required = true)
    @NotNull(message = "agentStatus不允许为空")
    private Integer agentStatus;
}