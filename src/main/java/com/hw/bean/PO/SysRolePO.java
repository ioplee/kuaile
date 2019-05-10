package com.hw.bean.PO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 11:11:28
* @description: [数据库实体BEAN]系统角色表
**/

@Data
public class SysRolePO implements Serializable {

    private static final long serialVersionUID = 4934737972148160737L;
    /**
    *   
    */
    private Long roleId;
    /**
    *   
    */
    private String roleName;
    /**
    *   
    */
    private String roleDesc;
    /**
    *   
    */
    private Integer roleStatus;
}
