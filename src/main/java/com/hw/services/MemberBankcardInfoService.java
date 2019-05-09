package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberBankcardInfoPO;
import com.hw.bean.VO.MemberBankcardInfoVO;
import com.hw.bean.BO.QueryMemberBankcardInfoPage;
import com.hw.bean.BO.QueryMemberBankcardInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 会员银行账户明细表 Service 接口
**/

public interface MemberBankcardInfoService {

    /**
    * Add 会员银行账户明细表 dto.
    *
    * @param memberBankcardInfoPO  会员银行账户明细表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO);

    /**
    * Modify 会员银行账户明细表 dto.
    *
    * @param memberBankcardInfoPO  会员银行账户明细表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberBankcardInfo(MemberBankcardInfoPO memberBankcardInfoPO);

    /**
    * Gets MemberBankcardInfo info.
    *
    * @param queryMemberBankcardInfoByPrimaryKey the query MemberBankcardInfo bean by primary key
    * @return the info
    */
    public ResultDTO<MemberBankcardInfoVO> getmemberBankcardInfo(QueryMemberBankcardInfoByPrimaryKey queryMemberBankcardInfoByPrimaryKey);

    /**
    * Gets MemberBankcardInfo list.
    *
    * @param queryMemberBankcardInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberBankcardInfoVO> getMemberBankcardInfoList(QueryMemberBankcardInfoPage queryMemberBankcardInfoPage);
}
