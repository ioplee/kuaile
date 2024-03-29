package com.hw.dao;

import com.hw.bean.BO.QueryAgentGBCondtion;
import com.hw.bean.BO.QueryAgentGoldenbeanInfoPage;
import com.hw.bean.PO.AgentGoldenbeanInfoPO;
import com.hw.bean.VO.AgentGoldenbeanInfoShowVO;
import com.hw.bean.VO.AgentGoldenbeanInfoVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * The interface Agent goldenbean info dao.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:11:41
 * @description: 代理商金豆明细表 DAO 数据库操作对象 Mybatis接口
 */
public interface AgentGoldenbeanInfoDAO{

    /**
     * Insert integer.  添加 代理商金豆明细表 记录
     *
     * @param agentGoldenbeanInfoPO 代理商金豆明细表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer insertAgentGoldenbeanInfo(AgentGoldenbeanInfoPO agentGoldenbeanInfoPO);

    /**
     * Update integer.  修改代理商金豆明细表 记录
     *
     * @param agentGoldenbeanInfoPO 代理商金豆明细表 数据实体对象
     * @return the integer  返回操作结果,1代表成功 0代表失败
     */
    public Integer updateAgentGoldenbeanInfo(AgentGoldenbeanInfoPO agentGoldenbeanInfoPO);

    /**
     * Select list count integer.
     *
     * @param query 获取代理商金豆明细表列表总记录数BO
     * @return the integer  返回记录数
     */
    public Integer getPageCount(QueryAgentGoldenbeanInfoPage query);

    /**
     * Select list list.
     *
     * @param query 获取代理商金豆明细表列表记录BO
     * @return the list  返回代理商金豆明细表记录集合
     */
    public List<AgentGoldenbeanInfoVO> getPageList(QueryAgentGoldenbeanInfoPage query);

    /**
     * Select by primary key 代理商金豆明细表 vo.
     *
     * @param PRI 记录ID
     * @return the AgentGoldenbeanInfoVO  指定 代理商金豆明细表 信息VO
     */
    public AgentGoldenbeanInfoVO getAgentGoldenbeanInfoByPrimaryKey(@Param(value="PRI")Long PRI);

    /**
     * Gets record count.       代理商金豆明细表记录总数(按条件查询)
     *
     * @param queryAgentGBCondtion the query agent gb condtion
     * @return the record count
     */
    public Integer getRecordCount(QueryAgentGBCondtion queryAgentGBCondtion);

    /**
     * Gets record list.        代理商金豆明细记录 (按条件查询)
     *
     * @param queryAgentGBCondtion the query agent gb condtion
     * @return the record list
     */
    public List<AgentGoldenbeanInfoShowVO> getRecordList(QueryAgentGBCondtion queryAgentGBCondtion);

}