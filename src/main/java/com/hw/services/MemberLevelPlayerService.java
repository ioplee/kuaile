package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberLevelPlayerPO;
import com.hw.bean.VO.MemberLevelPlayerVO;
import com.hw.bean.BO.QueryMemberLevelPlayerPage;
import com.hw.bean.BO.QueryMemberLevelPlayerByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 玩家会员等级表 Service 接口
**/

public interface MemberLevelPlayerService {

    /**
    * Add 玩家会员等级表 dto.
    *
    * @param memberLevelPlayerPO  玩家会员等级表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberLevelPlayer(MemberLevelPlayerPO memberLevelPlayerPO);

    /**
    * Modify 玩家会员等级表 dto.
    *
    * @param memberLevelPlayerPO  玩家会员等级表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberLevelPlayer(MemberLevelPlayerPO memberLevelPlayerPO);

    /**
    * Gets MemberLevelPlayer info.
    *
    * @param queryMemberLevelPlayerByPrimaryKey the query MemberLevelPlayer bean by primary key
    * @return the info
    */
    public ResultDTO<MemberLevelPlayerVO> getmemberLevelPlayer(QueryMemberLevelPlayerByPrimaryKey queryMemberLevelPlayerByPrimaryKey);

    /**
    * Gets MemberLevelPlayer list.
    *
    * @param queryMemberLevelPlayerPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberLevelPlayerVO> getMemberLevelPlayerList(QueryMemberLevelPlayerPage queryMemberLevelPlayerPage);
}
