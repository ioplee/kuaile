package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberXpToBeanPO;
import com.hw.bean.VO.MemberXpToBeanVO;
import com.hw.bean.BO.QueryMemberXpToBeanPage;
import com.hw.bean.BO.QueryMemberXpToBeanByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 会员经验兑换金豆记录表 Service 接口
**/

public interface MemberXpToBeanService {

    /**
    * Add 会员经验兑换金豆记录表 dto.
    *
    * @param memberXpToBeanPO  会员经验兑换金豆记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberXpToBean(MemberXpToBeanPO memberXpToBeanPO);

    /**
    * Modify 会员经验兑换金豆记录表 dto.
    *
    * @param memberXpToBeanPO  会员经验兑换金豆记录表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberXpToBean(MemberXpToBeanPO memberXpToBeanPO);

    /**
    * Gets MemberXpToBean info.
    *
    * @param queryMemberXpToBeanByPrimaryKey the query MemberXpToBean bean by primary key
    * @return the info
    */
    public ResultDTO<MemberXpToBeanVO> getmemberXpToBean(QueryMemberXpToBeanByPrimaryKey queryMemberXpToBeanByPrimaryKey);

    /**
    * Gets MemberXpToBean list.
    *
    * @param queryMemberXpToBeanPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberXpToBeanVO> getMemberXpToBeanList(QueryMemberXpToBeanPage queryMemberXpToBeanPage);
}
