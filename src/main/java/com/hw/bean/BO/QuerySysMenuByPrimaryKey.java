package com.hw.bean.BO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:08:58
* @description: [BO query bean]系统菜单表（系统权限控制在菜单级）
**/

@Data
public class QuerySysMenuByPrimaryKey implements Serializable{

    private static final long serialVersionUID = -5153396078618575925L;
    @ApiModelProperty(value = "菜单ID" , required = true)
    @NotNull(message = "菜单ID不允许为空")
    private Long menuId;
}