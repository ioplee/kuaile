package com.hw.dao;

import com.hw.bean.BO.QueryAgentInfoPage;
import com.hw.bean.VO.AgentInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 平台代理商信息 DAO 数据库操作对象 Mybatis接口
**/

public interface AgentInfoDAO{

    /**
    * Insert integer.  添加 平台代理商信息 记录
    *
    * @param agentInfoPO  平台代理商信息 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertAgentInfo(AgentInfoPO agentInfoPO);

    /**
    * Update integer.  修改平台代理商信息 记录
    *
    * @param agentInfoPO  平台代理商信息 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateAgentInfo(AgentInfoPO agentInfoPO);

    /**
    * Select list count integer.
    *
    * @param query 获取平台代理商信息列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryAgentInfoPage query);

    /**
    * Select list list.
    *
    * @param query 获取平台代理商信息列表记录BO
    * @return the list  返回平台代理商信息记录集合
    */
    public List<AgentInfoVO> getPageList(QueryAgentInfoPage query);

    /**
    * Select by primary key 平台代理商信息 vo.
    *
    * @param PRI 记录ID
    * @return the AgentInfoVO  指定 平台代理商信息 信息VO
    */
    public AgentInfoVO getAgentInfoByPrimaryKey(@Param(value = "PRI") Long PRI);

}