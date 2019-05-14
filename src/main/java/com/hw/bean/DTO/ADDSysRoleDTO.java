package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:59
* @description: [ADD DTO Bean]系统角色表
**/

@Data
public class ADDSysRoleDTO implements Serializable {

    private static final long serialVersionUID = 8070915924547846749L;
    /**
    *   
    */
    @ApiModelProperty(value = "roleName(角色名称)" , required = true)
    @NotNull(message = "roleName不允许为空")
    private String roleName;
    /**
    *   
    */
    @ApiModelProperty(value = "roleDesc(角色描述)" , required = true)
    @NotNull(message = "roleDesc不允许为空")
    private String roleDesc;
    /**
    *   
    */
    @ApiModelProperty(value = "roleStatus(角色状态-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "roleStatus不允许为空")
    private Integer roleStatus;

    /**
     * 角色赋予的菜单集合
     */
    @ApiModelProperty(value = "菜单ID集合,例如1,2")
    private List<Long> resourceID;
}