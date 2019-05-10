package com.hw.dao;

import com.hw.bean.BO.QuerySysRelationRoleResourcePage;
import com.hw.bean.PO.SysRelationRoleResourcePO;
import com.hw.bean.VO.SysRelationRoleResourceVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:46
* @description: 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） DAO 数据库操作对象 Mybatis接口
**/

public interface SysRelationRoleResourceDAO{

    /**
    * Insert integer.  添加 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 记录
    *
    * @param sysRelationRoleResourcePO  角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSysRelationRoleResource(SysRelationRoleResourcePO sysRelationRoleResourcePO);

    /**
    * Update integer.  修改角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 记录
    *
    * @param sysRelationRoleResourcePO  角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSysRelationRoleResource(SysRelationRoleResourcePO sysRelationRoleResourcePO);

    /**
    * Select list count integer.
    *
    * @param query 获取角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySysRelationRoleResourcePage query);

    /**
    * Select list list.
    *
    * @param query 获取角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）列表记录BO
    * @return the list  返回角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级）记录集合
    */
    public List<SysRelationRoleResourceVO> getPageList(QuerySysRelationRoleResourcePage query);

    /**
    * Select by primary key 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） vo.
    *
    * @param PRI 记录ID
    * @return the SysRelationRoleResourceVO  指定 角色具有权限表（目前角色只配置到菜单，后续可以扩展配置到功能级） 信息VO
    */
    public SysRelationRoleResourceVO getSysRelationRoleResourceByPrimaryKey(@Param(value="PRI")Long PRI);

}