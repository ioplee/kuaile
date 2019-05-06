package com.hw.dao;

import com.hw.bean.BO.QueryAgentGoldenbeanPage;
import com.hw.bean.VO.AgentGoldenbeanVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author: Robin
* @create: 2019-04-25 01:58:43
* @description: 代理商金豆信息表 DAO 数据库操作对象 Mybatis接口
**/

public interface AgentGoldenbeanDAO{

    /**
    * Insert integer.  添加 代理商金豆信息表 记录
    *
    * @param agentGoldenbeanPO  代理商金豆信息表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer insertAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
    * Update integer.  修改代理商金豆信息表 记录
    *
    * @param agentGoldenbeanPO  代理商金豆信息表 数据实体对象
    * @return the integer  返回操作结果,1代表成功 0代表失败
    */
    public Integer updateAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
    * Select list count integer.
    *
    * @param query 获取代理商金豆信息表列表总记录数BO
    * @return the integer  返回记录数
    */
    public Integer getPageCount(QueryAgentGoldenbeanPage query);

    /**
    * Select list list.
    *
    * @param query 获取代理商金豆信息表列表记录BO
    * @return the list  返回代理商金豆信息表记录集合
    */
    public List<AgentGoldenbeanVO> getPageList(QueryAgentGoldenbeanPage query);

    /**
    * Select by primary key 代理商金豆信息表 vo.
    *
    * @param PRI 记录ID
    * @return the AgentGoldenbeanVO  指定 代理商金豆信息表 信息VO
    */
    public AgentGoldenbeanVO getAgentGoldenbeanByPrimaryKey(@Param(value = "PRI") Long PRI);

}