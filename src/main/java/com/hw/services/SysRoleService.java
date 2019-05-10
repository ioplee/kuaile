package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.SysRolePO;
import com.hw.bean.VO.SysRoleVO;
import com.hw.bean.BO.QuerySysRolePage;
import com.hw.bean.BO.QuerySysRoleByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:36
* @description: 系统角色表 Service 接口
**/

public interface SysRoleService {

    /**
    * Add 系统角色表 dto.
    *
    * @param sysRolePO  系统角色表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addSysRole(SysRolePO sysRolePO);

    /**
    * Modify 系统角色表 dto.
    *
    * @param sysRolePO  系统角色表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifySysRole(SysRolePO sysRolePO);

    /**
    * Gets SysRole info.
    *
    * @param querySysRoleByPrimaryKey the query SysRole bean by primary key
    * @return the info
    */
    public ResultDTO<SysRoleVO> getsysRole(QuerySysRoleByPrimaryKey querySysRoleByPrimaryKey);

    /**
    * Gets SysRole list.
    *
    * @param querySysRolePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<SysRoleVO> getSysRoleList(QuerySysRolePage querySysRolePage);
}
