package com.hw.dao;

import com.hw.bean.BO.QueryAgentGoldenbeanPage;
import com.hw.bean.PO.AgentGoldenbeanPO;
import com.hw.bean.VO.AgentGoldenbeanVO;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Agent goldenbean dao.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:11:41
 * @description: 代理商金豆表 DAO 数据库操作对象 Mybatis接口
 */
public interface AgentGoldenbeanDAO{

    /**
     * Insert integer.  添加 代理商金豆表 记录
     *
     * @param agentGoldenbeanPO 代理商金豆表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer insertAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
     * Update integer.  修改代理商金豆表 记录
     *
     * @param agentGoldenbeanPO 代理商金豆表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer updateAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
     * Select list count integer.
     *
     * @param query 获取代理商金豆表列表总记录数BO
     * @return the integer  返回记录数
     */
    public Integer getPageCount(QueryAgentGoldenbeanPage query);

    /**
     * Select list list.
     *
     * @param query 获取代理商金豆表列表记录BO
     * @return the list  返回代理商金豆表记录集合
     */
    public List<AgentGoldenbeanVO> getPageList(QueryAgentGoldenbeanPage query);

    /**
     * Select by primary key 代理商金豆表 vo.
     *
     * @param PRI 记录ID
     * @return the AgentGoldenbeanVO  指定 代理商金豆表 信息VO
     */
    public AgentGoldenbeanVO getAgentGoldenbeanByPrimaryKey(@Param(value="PRI")Long PRI);

    /**
     * Up agent golden bean integer.  代理商上分(累加代理商金豆数,即累加总额)
     *
     * @param beanCounts the bean counts
     * @param agentID    the agent id
     * @return the integer
     */
    public Integer upAgentGoldenBean(@Param("beanCounts")Long beanCounts,@Param("agentID")Long agentID);

    /**
     * Exist agent golden bean record integer.  根据代理商编号查询代理商金豆总数记录是否存在
     *
     * @param agentID the agent id              代理商编号,不是自增系列,是系统配置的有序序列
     * @return the integer                      返回值如果为0,则表明不存在,如果为1则表明已存在,非0/1 则代表代理商存在问题,需运维人员进行维护.
     */
    public Integer existAgentGoldenBeanRecord(@Param("agentID")Long agentID);

    /**
     * Down agent golden bean integer.  代理商下分
     *
     * @param beanCounts the bean counts
     * @param agentID    the agent id
     * @return the integer
     */
    public Integer downAgentGoldenBean(@Param("beanCounts")Long beanCounts,@Param("agentID")Long agentID);

}