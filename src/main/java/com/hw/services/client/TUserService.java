package com.hw.services.client;

import com.hw.bean.BO.QueryTUserPageBO;
import com.hw.bean.PO.TUserPO;
import com.hw.bean.VO.TUserVO;
import com.hw.utils.BaseResultDTO;
import com.hw.utils.BatchResultDTO;

/**
 * Created by robin on 2019/4/11.
 */
public interface TUserService {

    public BaseResultDTO addTUser(TUserPO tUserPO);

    public BaseResultDTO modifyTUser(TUserPO tUserPO);

    public BaseResultDTO setTUserStatus(TUserPO tUserPO);

    public BatchResultDTO<TUserVO> getTUserPage(QueryTUserPageBO queryTUserPageBO);

}
