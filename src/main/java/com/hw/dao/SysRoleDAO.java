package com.hw.dao;

import com.hw.bean.BO.QuerySysRolePage;
import com.hw.bean.PO.SysRolePO;
import com.hw.bean.VO.SysRoleVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:46
* @description: 系统角色表 DAO 数据库操作对象 Mybatis接口
**/

public interface SysRoleDAO{

    /**
    * Insert integer.  添加 系统角色表 记录
    *
    * @param sysRolePO  系统角色表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSysRole(SysRolePO sysRolePO);

    /**
    * Update integer.  修改系统角色表 记录
    *
    * @param sysRolePO  系统角色表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSysRole(SysRolePO sysRolePO);

    /**
    * Select list count integer.
    *
    * @param query 获取系统角色表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySysRolePage query);

    /**
    * Select list list.
    *
    * @param query 获取系统角色表列表记录BO
    * @return the list  返回系统角色表记录集合
    */
    public List<SysRoleVO> getPageList(QuerySysRolePage query);

    /**
    * Select by primary key 系统角色表 vo.
    *
    * @param PRI 记录ID
    * @return the SysRoleVO  指定 系统角色表 信息VO
    */
    public SysRoleVO getSysRoleByPrimaryKey(@Param(value="PRI")Long PRI);

}