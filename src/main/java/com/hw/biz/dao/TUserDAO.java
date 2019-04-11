package com.hw.biz.dao;

import com.hw.bean.BO.QueryTUserPageBO;
import com.hw.bean.PO.TUserPO;
import com.hw.bean.VO.TUserVO;

import java.util.List;

/**
 * Created by robin on 2019/4/11.
 */
public interface TUserDAO {

    public Integer addUser(TUserPO tUserPO);

    public Integer modifyUser(TUserPO tUserPO);

    public Integer setUserStatus(TUserPO tUserPO);

    public List<TUserVO> getUserList(QueryTUserPageBO queryTUserPageBO);

    public Integer getUserListCount(QueryTUserPageBO queryTUserPageBO);
}
