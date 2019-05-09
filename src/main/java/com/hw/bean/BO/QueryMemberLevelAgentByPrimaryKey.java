package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:27
* @description: [BO query bean]代理会员等级（直充模式下代理玩家各个等级的配置信息）
**/

@Data
public class QueryMemberLevelAgentByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -8484771470647347225L;
    @ApiModelProperty(value = "等级ID" , required = true)
    @NotNull(message = "等级ID不允许为空")
    private Long levelId;
}