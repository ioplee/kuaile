package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberAlmsbeanInfoPO;
import com.hw.bean.VO.MemberAlmsbeanInfoVO;
import com.hw.bean.BO.QueryMemberAlmsbeanInfoPage;
import com.hw.bean.BO.QueryMemberAlmsbeanInfoByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 会员每日救济金豆领取记录表 Service 接口
**/

public interface MemberAlmsbeanInfoService {

    /**
    * Add 会员每日救济金豆领取记录表 dto.
    *
    * @param memberAlmsbeanInfoPO  会员每日救济金豆领取记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO);

    /**
    * Modify 会员每日救济金豆领取记录表 dto.
    *
    * @param memberAlmsbeanInfoPO  会员每日救济金豆领取记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberAlmsbeanInfo(MemberAlmsbeanInfoPO memberAlmsbeanInfoPO);

    /**
    * Gets MemberAlmsbeanInfo info.
    *
    * @param queryMemberAlmsbeanInfoByPrimaryKey the query MemberAlmsbeanInfo bean by primary key
    * @return the info
    */
    public ResultDTO<MemberAlmsbeanInfoVO> getmemberAlmsbeanInfo(QueryMemberAlmsbeanInfoByPrimaryKey queryMemberAlmsbeanInfoByPrimaryKey);

    /**
    * Gets MemberAlmsbeanInfo list.
    *
    * @param queryMemberAlmsbeanInfoPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberAlmsbeanInfoVO> getMemberAlmsbeanInfoList(QueryMemberAlmsbeanInfoPage queryMemberAlmsbeanInfoPage);
}
