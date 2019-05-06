package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-07 00:53:18
* @description: [ADD DTO Bean]玩家关系族谱表
**/

@Data
public class ADDMemberRelationDTO implements Serializable {

    private static final long serialVersionUID = -943779217254880196L;
    /**
    *   玩家ID
    */
    @ApiModelProperty(value = "playerId" , required = true)
    @NotNull(message = "playerId不允许为空")
    private Long playerId;
    /**
    *   上级ID
    */
    @ApiModelProperty(value = "parentId" , required = true)
    @NotNull(message = "parentId不允许为空")
    private Long parentId;
    /**
    *   当前玩家级别深度
    */
    @ApiModelProperty(value = "relationLevel" , required = true)
    @NotNull(message = "relationLevel不允许为空")
    private Integer relationLevel;
    /**
    *   当前玩家抽成比例
    */
    @ApiModelProperty(value = "currentCut" , required = true)
    @NotNull(message = "currentCut不允许为空")
    private Integer currentCut;
    /**
    *   上家抽成比例
    */
    @ApiModelProperty(value = "parentCut" , required = true)
    @NotNull(message = "parentCut不允许为空")
    private Integer parentCut;
    /**
    *   记录状态
    */
    @ApiModelProperty(value = "relationStatus" , required = true)
    @NotNull(message = "relationStatus不允许为空")
    private Integer relationStatus;
    /**
    *   最后修改时间
    */
    @ApiModelProperty(value = "gmtModify" , required = true)
    @NotNull(message = "gmtModify不允许为空")
    private String gmtModify;
}