package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]玩家会员等级表
**/

@Data
public class ModifyMemberLevelPlayerDTO extends ADDMemberLevelPlayerDTO {

    @ApiModelProperty(value = "等级ID" , required = true)
    @NotNull(message = "等级ID不允许为空")
    private Long levelId;

}