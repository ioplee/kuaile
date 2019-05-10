package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.SysRelationRoleResourcePO;
import com.hw.bean.VO.SysRelationRoleResourceVO;
import com.hw.bean.BO.QuerySysRelationRoleResourcePage;
import com.hw.bean.BO.QuerySysRelationRoleResourceByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:11:36
* @description: 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） Service 接口
**/

public interface SysRelationRoleResourceService {

    /**
    * Add 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） dto.
    *
    * @param sysRelationRoleResourcePO  角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addSysRelationRoleResource(SysRelationRoleResourcePO sysRelationRoleResourcePO);

    /**
    * Modify 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） dto.
    *
    * @param sysRelationRoleResourcePO  角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifySysRelationRoleResource(SysRelationRoleResourcePO sysRelationRoleResourcePO);

    /**
    * Gets SysRelationRoleResource info.
    *
    * @param querySysRelationRoleResourceByPrimaryKey the query SysRelationRoleResource bean by primary key
    * @return the info
    */
    public ResultDTO<SysRelationRoleResourceVO> getsysRelationRoleResource(QuerySysRelationRoleResourceByPrimaryKey querySysRelationRoleResourceByPrimaryKey);

    /**
    * Gets SysRelationRoleResource list.
    *
    * @param querySysRelationRoleResourcePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<SysRelationRoleResourceVO> getSysRelationRoleResourceList(QuerySysRelationRoleResourcePage querySysRelationRoleResourcePage);
}
