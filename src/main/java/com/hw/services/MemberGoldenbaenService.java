package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberGoldenbaenPO;
import com.hw.bean.VO.MemberGoldenbaenVO;
import com.hw.bean.BO.QueryMemberGoldenbaenPage;
import com.hw.bean.BO.QueryMemberGoldenbaenByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:31
* @description: 会员金豆账户表 Service 接口
**/

public interface MemberGoldenbaenService {

    /**
    * Add 会员金豆账户表 dto.
    *
    * @param memberGoldenbaenPO  会员金豆账户表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberGoldenbaen(MemberGoldenbaenPO memberGoldenbaenPO);

    /**
    * Modify 会员金豆账户表 dto.
    *
    * @param memberGoldenbaenPO  会员金豆账户表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberGoldenbaen(MemberGoldenbaenPO memberGoldenbaenPO);

    /**
    * Gets MemberGoldenbaen info.
    *
    * @param queryMemberGoldenbaenByPrimaryKey the query MemberGoldenbaen bean by primary key
    * @return the info
    */
    public ResultDTO<MemberGoldenbaenVO> getmemberGoldenbaen(QueryMemberGoldenbaenByPrimaryKey queryMemberGoldenbaenByPrimaryKey);

    /**
    * Gets MemberGoldenbaen list.
    *
    * @param queryMemberGoldenbaenPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberGoldenbaenVO> getMemberGoldenbaenList(QueryMemberGoldenbaenPage queryMemberGoldenbaenPage);
}
