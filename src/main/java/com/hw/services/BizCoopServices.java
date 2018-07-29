package com.hw.services;

import com.hw.biz.model.BusinessCooperationDO;

import java.util.List;

public interface BizCoopServices {

    public List<BusinessCooperationDO> findAllBusinessCooperation();

    public int insert(BusinessCooperationDO businessCooperationDO);

    public int delete(Long id);

    public int update(BusinessCooperationDO businessCooperationDO);

    public BusinessCooperationDO findBizCoopById(Long id);

}
