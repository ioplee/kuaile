package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberBankcardPO;
import com.hw.bean.VO.MemberBankcardVO;
import com.hw.bean.BO.QueryMemberBankcardPage;
import com.hw.bean.BO.QueryMemberBankcardByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-10 00:12:40
* @description: 会员银行账户表 Service 接口
**/

public interface MemberBankcardService {

    /**
    * Add 会员银行账户表 dto.
    *
    * @param memberBankcardPO  会员银行账户表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberBankcard(MemberBankcardPO memberBankcardPO);

    /**
    * Modify 会员银行账户表 dto.
    *
    * @param memberBankcardPO  会员银行账户表 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberBankcard(MemberBankcardPO memberBankcardPO);

    /**
    * Gets MemberBankcard info.
    *
    * @param queryMemberBankcardByPrimaryKey the query MemberBankcard bean by primary key
    * @return the info
    */
    public ResultDTO<MemberBankcardVO> getmemberBankcard(QueryMemberBankcardByPrimaryKey queryMemberBankcardByPrimaryKey);

    /**
    * Gets MemberBankcard list.
    *
    * @param queryMemberBankcardPage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberBankcardVO> getMemberBankcardList(QueryMemberBankcardPage queryMemberBankcardPage);
}
