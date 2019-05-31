package com.hw.services;

import com.hw.bean.BO.QueryAgentGBCondtion;
import com.hw.bean.BO.QueryAgentGoldenbeanInfoByPrimaryKey;
import com.hw.bean.BO.QueryAgentGoldenbeanInfoPage;
import com.hw.bean.PO.AgentGoldenbeanInfoPO;
import com.hw.bean.VO.AgentGoldenbeanInfoShowVO;
import com.hw.bean.VO.AgentGoldenbeanInfoVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
 * The interface Agent goldenbean info service.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:12:39
 * @description: 代理商金豆明细表 Service 接口
 */
public interface AgentGoldenbeanInfoService {

    /**
     * Add 代理商金豆明细表 dto.
     *
     * @param agentGoldenbeanInfoPO 代理商金豆明细表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO addAgentGoldenbeanInfo(AgentGoldenbeanInfoPO agentGoldenbeanInfoPO);

    /**
     * Modify 代理商金豆明细表 dto.
     *
     * @param agentGoldenbeanInfoPO 代理商金豆明细表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO modifyAgentGoldenbeanInfo(AgentGoldenbeanInfoPO agentGoldenbeanInfoPO);

    /**
     * Gets AgentGoldenbeanInfo info.
     *
     * @param queryAgentGoldenbeanInfoByPrimaryKey the query AgentGoldenbeanInfo bean by primary key
     * @return the info
     */
    public ResultDTO<AgentGoldenbeanInfoVO> getagentGoldenbeanInfo(QueryAgentGoldenbeanInfoByPrimaryKey queryAgentGoldenbeanInfoByPrimaryKey);

    /**
     * Gets AgentGoldenbeanInfo list.    根据代理商查询代理商金豆明细
     *
     * @param queryAgentGoldenbeanInfoPage the query bean for page
     * @return the agent info list
     */
    public BatchResultDTO<AgentGoldenbeanInfoVO> getAgentGoldenbeanInfoList(QueryAgentGoldenbeanInfoPage queryAgentGoldenbeanInfoPage);

    /**
     * Gets agent goldenbean by condition.  按条件查询代理商金豆明细记录
     *
     * @param queryAgentGBCondtion the query agent gb condtion
     * @return the agent goldenbean by condition
     */
    public BatchResultDTO<AgentGoldenbeanInfoShowVO> getAgentGoldenbeanByCondition(QueryAgentGBCondtion queryAgentGBCondtion);
}
