package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:10:59
* @description: [ADD DTO Bean]用户具有角色记录表
**/

@Data
public class ADDSysRelationUserRoleDTO implements Serializable {

    private static final long serialVersionUID = 7610859917139016500L;
    /**
    *   用户ID
    */
    @ApiModelProperty(value = "userId" , required = true)
    @NotNull(message = "userId不允许为空")
    private Long userId;
    /**
    *   角色ID
    */
    @ApiModelProperty(value = "roleId" , required = true)
    @NotNull(message = "roleId不允许为空")
    private Long roleId;
    /**
    *   记录状态 -1删除 0停用 1有效
    */
    @ApiModelProperty(value = "infoStatus" , required = true)
    @NotNull(message = "infoStatus不允许为空")
    private Integer infoStatus;
}