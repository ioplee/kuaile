package com.hw.dao;

import com.hw.bean.BO.QuerySysUserPage;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysUserVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:47
* @description: 系统用户表 DAO 数据库操作对象 Mybatis接口
**/

public interface SysUserDAO{

    /**
    * Insert integer.  添加 系统用户表 记录
    *
    * @param sysUserPO  系统用户表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSysUser(SysUserPO sysUserPO);

    /**
    * Update integer.  修改系统用户表 记录
    *
    * @param sysUserPO  系统用户表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSysUser(SysUserPO sysUserPO);

    /**
    * Select list count integer.
    *
    * @param query 获取系统用户表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySysUserPage query);

    /**
    * Select list list.
    *
    * @param query 获取系统用户表列表记录BO
    * @return the list  返回系统用户表记录集合
    */
    public List<SysUserVO> getPageList(QuerySysUserPage query);

    /**
    * Select by primary key 系统用户表 vo.
    *
    * @param PRI 记录ID
    * @return the SysUserVO  指定 系统用户表 信息VO
    */
    public SysUserVO getSysUserByPrimaryKey(@Param(value="PRI")Long PRI);

}