package com.hw.services;

import com.hw.bean.BO.QueryAgentGoldenbeanByPrimaryKey;
import com.hw.bean.BO.QueryAgentGoldenbeanPage;
import com.hw.bean.PO.AgentGoldenbeanPO;
import com.hw.bean.VO.AgentGoldenbeanVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
 * The interface Agent goldenbean service.
 *
 * @author: Robin
 * @create: 2019 -05-10 00:12:39
 * @description: 代理商金豆表 Service 接口
 */
public interface AgentGoldenbeanService {

    /**
     * Add 代理商金豆表 dto.
     *
     * @param agentGoldenbeanPO 代理商金豆表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO addAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
     * Modify 代理商金豆表 dto.
     *
     * @param agentGoldenbeanPO 代理商金豆表 实体对象
     * @return the base result dto   操作结果
     */
    public BaseResultDTO modifyAgentGoldenbean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
     * Gets AgentGoldenbean info.
     *
     * @param queryAgentGoldenbeanByPrimaryKey the query AgentGoldenbean bean by primary key
     * @return the info
     */
    public ResultDTO<AgentGoldenbeanVO> getagentGoldenbean(QueryAgentGoldenbeanByPrimaryKey queryAgentGoldenbeanByPrimaryKey);

    /**
     * Gets AgentGoldenbean list.
     *
     * @param queryAgentGoldenbeanPage the query bean for page
     * @return the agent info list
     */
    public BatchResultDTO<AgentGoldenbeanVO> getAgentGoldenbeanList(QueryAgentGoldenbeanPage queryAgentGoldenbeanPage);

    /**
     * Up agent golden bean base result dto.    代理商上分
     *
     * @param agentGoldenbeanPO the agent goldenbean po
     * @return the base result dto
     */
    public BaseResultDTO upAgentGoldenBean(AgentGoldenbeanPO agentGoldenbeanPO);

    /**
     * Down agent golden bean base result dto.              代理商下分
     *
     * @param agentGoldenbeanPO the agent goldenbean po
     * @return the base result dto
     */
    public BaseResultDTO downAgentGoldenBean(AgentGoldenbeanPO agentGoldenbeanPO);
}
