package com.hw.dao;

import com.hw.bean.BO.QuerySysRelationUserRolePage;
import com.hw.bean.PO.SysRelationUserRolePO;
import com.hw.bean.VO.SysRelationUserRoleVO;

import com.hw.bean.VO.SysRoleVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:46
* @description: 用户具有角色记录表 DAO 数据库操作对象 Mybatis接口
**/

public interface SysRelationUserRoleDAO{

    /**
    * Insert integer.  添加 用户具有角色记录表 记录
    *
    * @param sysRelationUserRolePO  用户具有角色记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSysRelationUserRole(SysRelationUserRolePO sysRelationUserRolePO);

    /**
    * Update integer.  修改用户具有角色记录表 记录
    *
    * @param sysRelationUserRolePO  用户具有角色记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSysRelationUserRole(SysRelationUserRolePO sysRelationUserRolePO);

    /**
    * Select list count integer.
    *
    * @param query 获取用户具有角色记录表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySysRelationUserRolePage query);

    /**
    * Select list list.
    *
    * @param query 获取用户具有角色记录表列表记录BO
    * @return the list  返回用户具有角色记录表记录集合
    */
    public List<SysRelationUserRoleVO> getPageList(QuerySysRelationUserRolePage query);

    /**
    * Select by primary key 用户具有角色记录表 vo.
    *
    * @param PRI 记录ID
    * @return the SysRelationUserRoleVO  指定 用户具有角色记录表 信息VO
    */
    public SysRelationUserRoleVO getSysRelationUserRoleByPrimaryKey(@Param(value="PRI")Long PRI);

    public Integer insertUserRoles(List<SysRelationUserRolePO> sysRelationUserRolePOs);

    public Integer removeRoleByUser(@Param("userID") Long userID);

    public List<SysRoleVO> getRoleListByUser(@Param("userID") Long userID);

}