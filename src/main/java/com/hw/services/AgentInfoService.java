package com.hw.services;

import com.hw.bean.BO.QueryAgentInfoByPrimaryKey;
import com.hw.bean.BO.QueryAgentInfoPage;
import com.hw.bean.PO.AgentInfoPO;
import com.hw.bean.VO.AgentInfoVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 代理商信息表 Service 接口
**/

public interface AgentInfoService {

    /**
    * Add 代理商信息表 dto.
    *
    * @param agentInfoPO  代理商信息表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addAgentInfo(AgentInfoPO agentInfoPO);

    /**
    * Modify 代理商信息表 dto.
    *
    * @param agentInfoPO  代理商信息表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyAgentInfo(AgentInfoPO agentInfoPO);

    /**
    * Gets AgentInfo info.
    *
    * @param queryAgentInfoByPrimaryKey the query AgentInfo bean by primary key
    * @return the info
    */
    public ResultDTO<AgentInfoVO> getagentInfo(QueryAgentInfoByPrimaryKey queryAgentInfoByPrimaryKey);

    /**
    * Gets AgentInfo list.
    *
    * @param queryAgentInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<AgentInfoVO> getAgentInfoList(QueryAgentInfoPage queryAgentInfoPage);
}
