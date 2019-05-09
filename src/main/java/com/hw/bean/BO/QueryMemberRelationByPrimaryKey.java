package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]玩家关系族谱表
**/

@Data
public class QueryMemberRelationByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -4245788485686479490L;
    @ApiModelProperty(value = "关系记录ID" , required = true)
    @NotNull(message = "关系记录ID不允许为空")
    private Long realtionId;
}