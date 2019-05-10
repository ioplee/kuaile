package com.hw.bean.DTO;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
* @author: Robin
* @create: 2019-05-10 11:10:59
* @description: [ADD DTO Bean]系统菜单表（系统权限控制在菜单级）
**/

@Data
public class ADDSysMenuDTO implements Serializable {

    private static final long serialVersionUID = -4166833639145405766L;
    /**
    *   菜单名称
    */
    @ApiModelProperty(value = "menuName" , required = true)
    @NotNull(message = "menuName不允许为空")
    private String menuName;
    /**
    *   菜单描述
    */
    @ApiModelProperty(value = "menuDesc")
    private String menuDesc;
    /**
    *   菜单链接地址
    */
    @ApiModelProperty(value = "menuUrl")
    private String menuUrl;
    /**
    *   上级菜单ID（如果是一级菜单，则此字段属性为-1）
    */
    @ApiModelProperty(value = "menuParent" , required = true)
    @NotNull(message = "menuParent不允许为空")
    private Long menuParent;
    /**
    *   菜单类型 0 系统菜单 1外部菜单
    */
    @ApiModelProperty(value = "menuType" , required = true)
    @NotNull(message = "menuType不允许为空")
    private Integer menuType;
    /**
    *   菜单状态 -1删除 0停用 1有效
    */
    @ApiModelProperty(value = "menuStatus" , required = true)
    @NotNull(message = "menuStatus不允许为空")
    private Integer menuStatus;
}