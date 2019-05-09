package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberRelationPO;
import com.hw.bean.VO.MemberRelationVO;
import com.hw.bean.BO.QueryMemberRelationPage;
import com.hw.bean.BO.QueryMemberRelationByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 玩家关系族谱表 Service 接口
**/

public interface MemberRelationService {

    /**
    * Add 玩家关系族谱表 dto.
    *
    * @param memberRelationPO  玩家关系族谱表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberRelation(MemberRelationPO memberRelationPO);

    /**
    * Modify 玩家关系族谱表 dto.
    *
    * @param memberRelationPO  玩家关系族谱表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberRelation(MemberRelationPO memberRelationPO);

    /**
    * Gets MemberRelation info.
    *
    * @param queryMemberRelationByPrimaryKey the query MemberRelation bean by primary key
    * @return the info
    */
    public ResultDTO<MemberRelationVO> getmemberRelation(QueryMemberRelationByPrimaryKey queryMemberRelationByPrimaryKey);

    /**
    * Gets MemberRelation list.
    *
    * @param queryMemberRelationPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberRelationVO> getMemberRelationList(QueryMemberRelationPage queryMemberRelationPage);
}
