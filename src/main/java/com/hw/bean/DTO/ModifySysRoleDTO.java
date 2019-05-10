package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 11:11:09
* @description: [ADD DTO Bean]系统角色表
**/

@Data
public class ModifySysRoleDTO extends ADDSysRoleDTO {

    private static final long serialVersionUID = -7325687445215968140L;
    @ApiModelProperty(value = "主键ID" , required = true)
    @NotNull(message = "主键ID不允许为空")
    private Long roleId;

}