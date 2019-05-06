package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberXpInfoPO;
import com.hw.bean.VO.MemberXpInfoVO;
import com.hw.bean.BO.QueryMemberXpInfoPage;
import com.hw.bean.BO.QueryMemberXpInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 会员经验值明细表 Service 接口
**/

public interface MemberXpInfoService {

    /**
    * Add 会员经验值明细表 dto.
    *
    * @param memberXpInfoPO  会员经验值明细表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberXpInfo(MemberXpInfoPO memberXpInfoPO);

    /**
    * Modify 会员经验值明细表 dto.
    *
    * @param memberXpInfoPO  会员经验值明细表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberXpInfo(MemberXpInfoPO memberXpInfoPO);

    /**
    * Gets MemberXpInfo info.
    *
    * @param queryMemberXpInfoByPrimaryKey the query MemberXpInfo bean by primary key
    * @return the info
    */
    public ResultDTO<MemberXpInfoVO> getmemberXpInfo(QueryMemberXpInfoByPrimaryKey queryMemberXpInfoByPrimaryKey);

    /**
    * Gets MemberXpInfo list.
    *
    * @param queryMemberXpInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberXpInfoVO> getMemberXpInfoList(QueryMemberXpInfoPage queryMemberXpInfoPage);
}
