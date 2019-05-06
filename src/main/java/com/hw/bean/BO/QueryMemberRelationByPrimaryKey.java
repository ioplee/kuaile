package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:52:39
* @description: [BO query bean]玩家关系族谱表
**/

@Data
public class QueryMemberRelationByPrimaryKey implements Serializable{

    @ApiModelProperty(value = "关系记录ID" , required = true)
    @NotNull(message = "关系记录ID不允许为空")
    private Long realtionId;
}