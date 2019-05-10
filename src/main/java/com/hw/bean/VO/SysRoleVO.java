package com.hw.bean.VO;

import lombok.Data;

import java.io.Serializable;

import java.lang.Long;
import java.lang.Integer;
import java.lang.String;

/**
* @author: Robin
* @create: 2019-05-10 11:11:52
* @description: [数据库View BEAN]系统角色表
**/

@Data
public class SysRoleVO implements Serializable {

    private static final long serialVersionUID = 6498433308699533995L;
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
