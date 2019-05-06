package com.hw.dao;

import com.hw.bean.BO.QuerySecurityTokenPage;
import com.hw.bean.PO.SecurityTokenPO;
import com.hw.bean.VO.SecurityTokenVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:20:17
* @description: 用户授信记录表 DAO 数据库操作对象 Mybatis接口
**/

public interface SecurityTokenDAO{

    /**
    * Insert integer.  添加 用户授信记录表 记录
    *
    * @param securityTokenPO  用户授信记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSecurityToken(SecurityTokenPO securityTokenPO);

    /**
    * Update integer.  修改用户授信记录表 记录
    *
    * @param securityTokenPO  用户授信记录表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSecurityToken(SecurityTokenPO securityTokenPO);

    /**
    * Select list count integer.
    *
    * @param query 获取用户授信记录表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySecurityTokenPage query);

    /**
    * Select list list.
    *
    * @param query 获取用户授信记录表列表记录BO
    * @return the list  返回用户授信记录表记录集合
    */
    public List<SecurityTokenVO> getPageList(QuerySecurityTokenPage query);

    /**
    * Select by primary key 用户授信记录表 vo.
    *
    * @param PRI 记录ID
    * @return the SecurityTokenVO  指定 用户授信记录表 信息VO
    */
    public SecurityTokenVO getSecurityTokenByPrimaryKey(@Param(value="PRI")Long PRI);

}