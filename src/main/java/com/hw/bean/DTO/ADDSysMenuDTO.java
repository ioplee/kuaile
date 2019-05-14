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
    @ApiModelProperty(value = "menuName(菜单名称)" , required = true)
    @NotNull(message = "menuName不允许为空")
    private String menuName;
    /**
    *   菜单描述
    */
    @ApiModelProperty(value = "menuDesc(菜单描述)")
    private String menuDesc;
    /**
    *   菜单链接地址
    */
    @ApiModelProperty(value = "menuUrl(菜单对应连接地址)")
    private String menuUrl;
    /**
    *   上级菜单ID（如果是一级菜单，则此字段属性为-1）
    */
    @ApiModelProperty(value = "menuParent(上级菜单ID,默认为-1)" , required = true)
    @NotNull(message = "menuParent不允许为空")
    private Long menuParent;
    /**
    *   菜单类型 0 系统菜单 1外部菜单
    */
    @ApiModelProperty(value = "menuType(菜单类型1内部 2外部)" , required = true)
    @NotNull(message = "menuType不允许为空")
    private Integer menuType;
    /**
    *   菜单状态 -1删除 0停用 1有效
    */
    @ApiModelProperty(value = "menuStatus(菜单状态-1删除 0停用 1有效)" , required = true)
    @NotNull(message = "menuStatus不允许为空")
    private Integer menuStatus;


}