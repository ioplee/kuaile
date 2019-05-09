package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 00:11:53
* @description: [ADD DTO Bean]代理会员等级（直充模式下代理玩家各个等级的配置信息）
**/

@Data
public class ADDMemberLevelAgentDTO implements Serializable {

    /**
    *   等级名称
    */
    @ApiModelProperty(value = "levelName" , required = true)
    @NotNull(message = "levelName不允许为空")
    private String levelName;
    /**
    *   等级抽成比例 0-999
    */
    @ApiModelProperty(value = "levelScore" , required = true)
    @NotNull(message = "levelScore不允许为空")
    private Integer levelScore;
    /**
    *   等级状态 -1删除 0停用 1有效
    */
    @ApiModelProperty(value = "levelStatus" , required = true)
    @NotNull(message = "levelStatus不允许为空")
    private Integer levelStatus;
}