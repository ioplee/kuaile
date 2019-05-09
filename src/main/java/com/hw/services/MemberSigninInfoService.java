package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberSigninInfoPO;
import com.hw.bean.VO.MemberSigninInfoVO;
import com.hw.bean.BO.QueryMemberSigninInfoPage;
import com.hw.bean.BO.QueryMemberSigninInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 会员签到记录表 Service 接口
**/

public interface MemberSigninInfoService {

    /**
    * Add 会员签到记录表 dto.
    *
    * @param memberSigninInfoPO  会员签到记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberSigninInfo(MemberSigninInfoPO memberSigninInfoPO);

    /**
    * Modify 会员签到记录表 dto.
    *
    * @param memberSigninInfoPO  会员签到记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberSigninInfo(MemberSigninInfoPO memberSigninInfoPO);

    /**
    * Gets MemberSigninInfo info.
    *
    * @param queryMemberSigninInfoByPrimaryKey the query MemberSigninInfo bean by primary key
    * @return the info
    */
    public ResultDTO<MemberSigninInfoVO> getmemberSigninInfo(QueryMemberSigninInfoByPrimaryKey queryMemberSigninInfoByPrimaryKey);

    /**
    * Gets MemberSigninInfo list.
    *
    * @param queryMemberSigninInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberSigninInfoVO> getMemberSigninInfoList(QueryMemberSigninInfoPage queryMemberSigninInfoPage);
}
