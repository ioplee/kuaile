package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 11:11:28
* @description: [数据库实体BEAN]角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）
**/

@Data
public class SysRelationRoleResourcePO implements Serializable {

    private static final long serialVersionUID = 3418718482966953626L;
    /**
    *   记录ID
    */
    private Long infoId;
    /**
    *   角色ID
    */
    private Long roleId;
    /**
    *   资源记录ID（菜单ID、功能ID）
    */
    private Long resourceId;
    /**
    *   资源类型（1菜单 2功能）
    */
    private Integer resourceType;
    /**
    *   记录状态-1删除 0停用 1有效
    */
    private Integer infoStatus;
}
