package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]代理会员等级（直充模式下代理玩家各个等级的配置信息）
**/

@Data
public class ModifyMemberLevelAgentDTO extends ADDMemberLevelAgentDTO {

    private static final long serialVersionUID = -414455953032459100L;
    @ApiModelProperty(value = "等级ID" , required = true)
    @NotNull(message = "等级ID不允许为空")
    private Long levelId;

}