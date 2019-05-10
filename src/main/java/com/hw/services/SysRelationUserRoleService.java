package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.SysRelationUserRolePO;
import com.hw.bean.VO.SysRelationUserRoleVO;
import com.hw.bean.BO.QuerySysRelationUserRolePage;
import com.hw.bean.BO.QuerySysRelationUserRoleByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:36
* @description: 用户具有角色记录表 Service 接口
**/

public interface SysRelationUserRoleService {

    /**
    * Add 用户具有角色记录表 dto.
    *
    * @param sysRelationUserRolePO  用户具有角色记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addSysRelationUserRole(SysRelationUserRolePO sysRelationUserRolePO);

    /**
    * Modify 用户具有角色记录表 dto.
    *
    * @param sysRelationUserRolePO  用户具有角色记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifySysRelationUserRole(SysRelationUserRolePO sysRelationUserRolePO);

    /**
    * Gets SysRelationUserRole info.
    *
    * @param querySysRelationUserRoleByPrimaryKey the query SysRelationUserRole bean by primary key
    * @return the info
    */
    public ResultDTO<SysRelationUserRoleVO> getsysRelationUserRole(QuerySysRelationUserRoleByPrimaryKey querySysRelationUserRoleByPrimaryKey);

    /**
    * Gets SysRelationUserRole list.
    *
    * @param querySysRelationUserRolePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<SysRelationUserRoleVO> getSysRelationUserRoleList(QuerySysRelationUserRolePage querySysRelationUserRolePage);
}
