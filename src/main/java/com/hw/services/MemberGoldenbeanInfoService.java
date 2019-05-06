package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberGoldenbeanInfoPO;
import com.hw.bean.VO.MemberGoldenbeanInfoVO;
import com.hw.bean.BO.QueryMemberGoldenbeanInfoPage;
import com.hw.bean.BO.QueryMemberGoldenbeanInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 会员金豆账户明细表 Service 接口
**/

public interface MemberGoldenbeanInfoService {

    /**
    * Add 会员金豆账户明细表 dto.
    *
    * @param memberGoldenbeanInfoPO  会员金豆账户明细表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO);

    /**
    * Modify 会员金豆账户明细表 dto.
    *
    * @param memberGoldenbeanInfoPO  会员金豆账户明细表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberGoldenbeanInfo(MemberGoldenbeanInfoPO memberGoldenbeanInfoPO);

    /**
    * Gets MemberGoldenbeanInfo info.
    *
    * @param queryMemberGoldenbeanInfoByPrimaryKey the query MemberGoldenbeanInfo bean by primary key
    * @return the info
    */
    public ResultDTO<MemberGoldenbeanInfoVO> getmemberGoldenbeanInfo(QueryMemberGoldenbeanInfoByPrimaryKey queryMemberGoldenbeanInfoByPrimaryKey);

    /**
    * Gets MemberGoldenbeanInfo list.
    *
    * @param queryMemberGoldenbeanInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberGoldenbeanInfoVO> getMemberGoldenbeanInfoList(QueryMemberGoldenbeanInfoPage queryMemberGoldenbeanInfoPage);
}
