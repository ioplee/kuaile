package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:28
* @description: [数据库实体BEAN]系统角色表
**/

@Data
public class SysRolePO implements Serializable {

    private static final long serialVersionUID = 4934737972148160737L;
    /**
    *   角色ID
    */
    private Long roleId;
    /**
    *   角色名称
    */
    private String roleName;
    /**
    *   角色描述
    */
    private String roleDesc;
    /**
    *  角色状态-1删除 0停用 1有效
    */
    private Integer roleStatus;

    /**
     * 角色赋予的权限集合
     */
    private List<SysRelationRoleResourcePO> resourcePOList;
}
