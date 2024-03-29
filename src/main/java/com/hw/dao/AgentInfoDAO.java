package com.hw.dao;

import com.hw.bean.BO.QueryAgentInfoPage;
import com.hw.bean.PO.AgentInfoPO;
import com.hw.bean.VO.AgentGoldenBeanShowVO;
import com.hw.bean.VO.AgentInfoVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Agent info dao.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:11:41
 * @description: 代理商信息表 DAO 数据库操作对象 Mybatis接口
 */
public interface AgentInfoDAO{

    /**
     * Insert integer.  添加 代理商信息表 记录
     *
     * @param agentInfoPO 代理商信息表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer insertAgentInfo(AgentInfoPO agentInfoPO);

    /**
     * Update integer.  修改代理商信息表 记录
     *
     * @param agentInfoPO 代理商信息表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer updateAgentInfo(AgentInfoPO agentInfoPO);

    /**
     * Select list count integer.
     *
     * @param query 获取代理商信息表列表总记录数BO
     * @return the integer  返回记录数
     */
    public Integer getPageCount(QueryAgentInfoPage query);

    /**
     * Select list list.
     *
     * @param query 获取代理商信息表列表记录BO
     * @return the list  返回代理商信息表记录集合
     */
    public List<AgentInfoVO> getPageList(QueryAgentInfoPage query);

    /**
     * Select by primary key 代理商信息表 vo.
     *
     * @param PRI 记录ID
     * @return the AgentInfoVO  指定 代理商信息表 信息VO
     */
    public AgentInfoVO getAgentInfoByPrimaryKey(@Param(value="PRI")Long PRI);

    /**
     * Exisit account integer.  判断当前登录账户是否存在
     *
     * @param agentAccount the agent account  登录账户
     * @return the integer
     */
    public Integer exisitAccount(@Param("account")String agentAccount);

    /**
     * Exisit account by user integer.
     *
     * @param account the account
     * @param agentID the agent id
     * @return the integer
     */
    public Integer exisitAccountByUser(@Param("account")String account,@Param("agentID")Long agentID);

    /**
     * Reset status integer.    修改代理商状态
     *
     * @param agentInfoPO the agent info po
     * @return the integer
     */
    public Integer resetStatus(AgentInfoPO agentInfoPO);

    /**
     * Gets agent count.    按条件查询代理商金豆明细查看的代理商列表总数
     *
     * @param queryAgentInfoPage the query agent info page
     * @return the agent count
     */
    public Integer getAgentCount(QueryAgentInfoPage queryAgentInfoPage);

    /**
     * Gets agent list.     按条件查询代理商金豆明细查看的代理商列表
     *
     * @param queryAgentInfoPage the query agent info page
     * @return the agent list
     */
    public List<AgentGoldenBeanShowVO> getAgentList(QueryAgentInfoPage queryAgentInfoPage);

}