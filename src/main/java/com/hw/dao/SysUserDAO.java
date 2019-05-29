package com.hw.dao;

import com.hw.bean.BO.QuerySysUserPage;
import com.hw.bean.PO.SysUserPO;
import com.hw.bean.VO.SysUserVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Sys user dao.
 *
 * @author: Robin
 * @create: 2019 -05-10 11:10:47
 * @description: 系统用户表 DAO 数据库操作对象 Mybatis接口
 */
public interface SysUserDAO{

    /**
     * Insert integer.  添加 系统用户表 记录
     *
     * @param sysUserPO 系统用户表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer insertSysUser(SysUserPO sysUserPO);

    /**
     * Update integer.  修改系统用户表 记录
     *
     * @param sysUserPO 系统用户表 数据实体对象
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

    /**
     * Gets user exsit. 判断用户是否存在
     *
     * @param account  the account      登录账户
     * @param password the password     用户登录密码(md5加密)
     * @return the user exsit           1 则代表用户存在 不等于1表明用户不存在
     */
    public Integer getUserExsit(@Param("account")String account,@Param("password")String password);

    /**
     * Gets user info.      查询用户信息
     *
     * @param account  the account
     * @param password the password
     * @return the user info
     */
    public SysUserVO getUserInfo(@Param("account")String account,@Param("password")String password);

    /**
     * Reset user status integer.      修改平台用户状态
     *
     * @param sysUserPO the sys user po
     * @return the integer
     */
    public Integer resetUserStatus(SysUserPO sysUserPO);

}