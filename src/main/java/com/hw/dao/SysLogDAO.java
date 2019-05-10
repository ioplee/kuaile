package com.hw.dao;

import com.hw.bean.BO.QuerySysLogPage;
import com.hw.bean.PO.SysLogPO;
import com.hw.bean.VO.SysLogVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 11:10:46
* @description: 系统日志 DAO 数据库操作对象 Mybatis接口
**/

public interface SysLogDAO{

    /**
    * Insert integer.  添加 系统日志 记录
    *
    * @param sysLogPO  系统日志 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertSysLog(SysLogPO sysLogPO);

    /**
    * Update integer.  修改系统日志 记录
    *
    * @param sysLogPO  系统日志 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateSysLog(SysLogPO sysLogPO);

    /**
    * Select list count integer.
    *
    * @param query 获取系统日志列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QuerySysLogPage query);

    /**
    * Select list list.
    *
    * @param query 获取系统日志列表记录BO
    * @return the list  返回系统日志记录集合
    */
    public List<SysLogVO> getPageList(QuerySysLogPage query);

    /**
    * Select by primary key 系统日志 vo.
    *
    * @param PRI 记录ID
    * @return the SysLogVO  指定 系统日志 信息VO
    */
    public SysLogVO getSysLogByPrimaryKey(@Param(value="PRI")Long PRI);

}