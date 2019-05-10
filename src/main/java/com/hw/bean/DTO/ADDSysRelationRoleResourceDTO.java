package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:10:59
* @description: [ADD DTO Bean]角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）
**/

@Data
public class ADDSysRelationRoleResourceDTO implements Serializable {

    private static final long serialVersionUID = -8581959545017282469L;
    /**
    *   角色ID
    */
    @ApiModelProperty(value = "roleId" , required = true)
    @NotNull(message = "roleId不允许为空")
    private Long roleId;
    /**
    *   资源记录ID（菜单ID、功能ID）
    */
    @ApiModelProperty(value = "resourceId" , required = true)
    @NotNull(message = "resourceId不允许为空")
    private Long resourceId;
    /**
    *   资源类型（1菜单 2功能）
    */
    @ApiModelProperty(value = "resourceType" , required = true)
    @NotNull(message = "resourceType不允许为空")
    private Integer resourceType;
    /**
    *   记录状态-1删除 0停用 1有效
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}