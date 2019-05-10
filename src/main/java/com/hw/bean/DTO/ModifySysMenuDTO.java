package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;


/**
* @author: Robin
* @create: 2019-05-10 11:11:09
* @description: [ADD DTO Bean]系统菜单表（系统权限控制在菜单级）
**/

@Data
public class ModifySysMenuDTO extends ADDSysMenuDTO {

    private static final long serialVersionUID = -4624750021822948525L;
    @ApiModelProperty(value = "菜单ID" , required = true)
    @NotNull(message = "菜单ID不允许为空")
    private Long menuId;

}