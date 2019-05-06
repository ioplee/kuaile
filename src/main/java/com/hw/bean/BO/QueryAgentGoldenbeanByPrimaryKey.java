package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]代理商金豆表
**/

@Data
public class QueryAgentGoldenbeanByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -7037092938368703955L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;
}