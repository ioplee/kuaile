package com.hw.services;

import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;
import com.hw.utils.ResultDTO;

import com.hw.bean.PO.MemberAccountChangePO;
import com.hw.bean.VO.MemberAccountChangeVO;
import com.hw.bean.BO.QueryMemberAccountChangePage;
import com.hw.bean.BO.QueryMemberAccountChangeByPrimaryKey;

import java.util.List;

/**
* @author: Robin
* @create: 2019-05-07 01:40:30
* @description: 会员金豆和银行账户转账记录 Service 接口
**/

public interface MemberAccountChangeService {

    /**
    * Add 会员金豆和银行账户转账记录 dto.
    *
    * @param memberAccountChangePO  会员金豆和银行账户转账记录 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO addMemberAccountChange(MemberAccountChangePO memberAccountChangePO);

    /**
    * Modify 会员金豆和银行账户转账记录 dto.
    *
    * @param memberAccountChangePO  会员金豆和银行账户转账记录 实体对象
    * @return the base result dto   操作结果
    */
    public BaseResultDTO modifyMemberAccountChange(MemberAccountChangePO memberAccountChangePO);

    /**
    * Gets MemberAccountChange info.
    *
    * @param queryMemberAccountChangeByPrimaryKey the query MemberAccountChange bean by primary key
    * @return the info
    */
    public ResultDTO<MemberAccountChangeVO> getmemberAccountChange(QueryMemberAccountChangeByPrimaryKey queryMemberAccountChangeByPrimaryKey);

    /**
    * Gets MemberAccountChange list.
    *
    * @param queryMemberAccountChangePage the query bean for page
    * @return the agent info list
    */
    public BatchResultDTO<MemberAccountChangeVO> getMemberAccountChangeList(QueryMemberAccountChangePage queryMemberAccountChangePage);
}
