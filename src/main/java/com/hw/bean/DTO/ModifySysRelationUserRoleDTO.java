package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 11:11:09
* @description: [ADD DTO Bean]用户具有角色记录表
**/

@Data
public class ModifySysRelationUserRoleDTO extends ADDSysRelationUserRoleDTO {

    private static final long serialVersionUID = -1567001676156528404L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;

}