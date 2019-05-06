package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberLevelPO;
import com.hw.bean.VO.MemberLevelVO;
import com.hw.bean.BO.QueryMemberLevelPage;
import com.hw.bean.BO.QueryMemberLevelByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 会员等级表 Service 接口
**/

public interface MemberLevelService {

    /**
    * Add 会员等级表 dto.
    *
    * @param memberLevelPO  会员等级表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberLevel(MemberLevelPO memberLevelPO);

    /**
    * Modify 会员等级表 dto.
    *
    * @param memberLevelPO  会员等级表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberLevel(MemberLevelPO memberLevelPO);

    /**
    * Gets MemberLevel info.
    *
    * @param queryMemberLevelByPrimaryKey the query MemberLevel bean by primary key
    * @return the info
    */
    public ResultDTO<MemberLevelVO> getmemberLevel(QueryMemberLevelByPrimaryKey queryMemberLevelByPrimaryKey);

    /**
    * Gets MemberLevel list.
    *
    * @param queryMemberLevelPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberLevelVO> getMemberLevelList(QueryMemberLevelPage queryMemberLevelPage);
}
