package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:38
* @description: [BO query bean]开奖数据源记录表
**/

@Data
public class QueryGameOrgSourceByPrimaryKey implements Serializable{

    private static final long serialVersionUID = 4252165050919400693L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long recordId;
}