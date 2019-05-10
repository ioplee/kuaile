package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 11:11:09
* @description: [ADD DTO Bean]角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）
**/

@Data
public class ModifySysRelationRoleResourceDTO extends ADDSysRelationRoleResourceDTO {

    private static final long serialVersionUID = -7728793323632095739L;
    @ApiModelProperty(value = "记录ID" , required = true)
    @NotNull(message = "记录ID不允许为空")
    private Long infoId;

}