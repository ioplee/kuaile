package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 11:11:52
* @description: [数据库View BEAN]系统菜单表（系统权限控制在菜单级）
**/

@Data
public class SysMenuVO implements Serializable {

    private static final long serialVersionUID = 8884852691480093476L;
    /**
    *   菜单ID
    */
    private Long menuId;
    /**
    *   菜单名称
    */
    private String menuName;
    /**
    *   菜单描述
    */
    private String menuDesc;
    /**
    *   菜单链接地址
    */
    private String menuUrl;
    /**
    *   上级菜单ID（如果是一级菜单，则此字段属性为-1）
    */
    private Long menuParent;
    /**
    *   菜单类型 0 系统菜单 1外部菜单
    */
    private Integer menuType;
    /**
    *   菜单状态 -1删除 0停用 1有效
    */
    private Integer menuStatus;
}
