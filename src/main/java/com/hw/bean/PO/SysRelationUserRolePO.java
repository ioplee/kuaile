package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;

/**
* @author: Robin
* @create: 2019-05-10 11:11:28
* @description: [数据库实体BEAN]用户具有角色记录表
**/

@Data
public class SysRelationUserRolePO implements Serializable {

    private static final long serialVersionUID = -3266977624944327131L;
    /**
    *   记录ID
    */
    private Long infoId;
    /**
    *   用户ID
    */
    private Long userId;
    /**
    *   角色ID
    */
    private Long roleId;
    /**
    *   记录状态 -1删除 0停用 1有效
    */
    private Integer infoStatus;
}
