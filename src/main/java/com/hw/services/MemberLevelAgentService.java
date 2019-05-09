package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberLevelAgentPO;
import com.hw.bean.VO.MemberLevelAgentVO;
import com.hw.bean.BO.QueryMemberLevelAgentPage;
import com.hw.bean.BO.QueryMemberLevelAgentByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 代理会员等级（直充模式下代理玩家各个等级的配置信息） Service 接口
**/

public interface MemberLevelAgentService {

    /**
    * Add 代理会员等级（直充模式下代理玩家各个等级的配置信息） dto.
    *
    * @param memberLevelAgentPO  代理会员等级（直充模式下代理玩家各个等级的配置信息） 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberLevelAgent(MemberLevelAgentPO memberLevelAgentPO);

    /**
    * Modify 代理会员等级（直充模式下代理玩家各个等级的配置信息） dto.
    *
    * @param memberLevelAgentPO  代理会员等级（直充模式下代理玩家各个等级的配置信息） 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberLevelAgent(MemberLevelAgentPO memberLevelAgentPO);

    /**
    * Gets MemberLevelAgent info.
    *
    * @param queryMemberLevelAgentByPrimaryKey the query MemberLevelAgent bean by primary key
    * @return the info
    */
    public ResultDTO<MemberLevelAgentVO> getmemberLevelAgent(QueryMemberLevelAgentByPrimaryKey queryMemberLevelAgentByPrimaryKey);

    /**
    * Gets MemberLevelAgent list.
    *
    * @param queryMemberLevelAgentPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberLevelAgentVO> getMemberLevelAgentList(QueryMemberLevelAgentPage queryMemberLevelAgentPage);
}
