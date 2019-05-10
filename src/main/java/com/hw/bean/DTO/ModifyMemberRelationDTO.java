package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 00:12:05
* @description: [ADD DTO Bean]玩家关系族谱表
**/

@Data
public class ModifyMemberRelationDTO extends ADDMemberRelationDTO {

    private static final long serialVersionUID = 2376098724130284145L;
    @ApiModelProperty(value = "关系记录ID" , required = true)
    @NotNull(message = "关系记录ID不允许为空")
    private Long realtionId;

}