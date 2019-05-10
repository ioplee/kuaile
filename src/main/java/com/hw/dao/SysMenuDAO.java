package com.hw.dao;

import com.hw.bean.BO.QuerySysMenuPage;
import com.hw.bean.PO.SysMenuPO;
import com.hw.bean.VO.SysMenuVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:46
* @description: 系统菜单表（系统权限控制在菜单级） DAO 数据库操作对象 Mybatis接口
**/

public interface SysMenuDAO{

    /**
    * Insert integer.  添加 系统菜单表（系统权限控制在菜单级） 记录
    *
    * @param sysMenuPO  系统菜单表（系统权限控制在菜单级） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSysMenu(SysMenuPO sysMenuPO);

    /**
    * Update integer.  修改系统菜单表（系统权限控制在菜单级） 记录
    *
    * @param sysMenuPO  系统菜单表（系统权限控制在菜单级） 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSysMenu(SysMenuPO sysMenuPO);

    /**
    * Select list count integer.
    *
    * @param query 获取系统菜单表（系统权限控制在菜单级）列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySysMenuPage query);

    /**
    * Select list list.
    *
    * @param query 获取系统菜单表（系统权限控制在菜单级）列表记录BO
    * @return the list  返回系统菜单表（系统权限控制在菜单级）记录集合
    */
    public List<SysMenuVO> getPageList(QuerySysMenuPage query);

    /**
    * Select by primary key 系统菜单表（系统权限控制在菜单级） vo.
    *
    * @param PRI 记录ID
    * @return the SysMenuVO  指定 系统菜单表（系统权限控制在菜单级） 信息VO
    */
    public SysMenuVO getSysMenuByPrimaryKey(@Param(value="PRI")Long PRI);

}