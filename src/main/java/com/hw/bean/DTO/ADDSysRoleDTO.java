package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

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
    @ApiModelProperty(value = "roleName" , required = true)
    @NotNull(message = "roleName不允许为空")
    private String roleName;
    /**
    *   
    */
    @ApiModelProperty(value = "roleDesc" , required = true)
    @NotNull(message = "roleDesc不允许为空")
    private String roleDesc;
    /**
    *   
    */
    @ApiModelProperty(value = "roleStatus" , required = true)
    @NotNull(message = "roleStatus不允许为空")
    private Integer roleStatus;
}