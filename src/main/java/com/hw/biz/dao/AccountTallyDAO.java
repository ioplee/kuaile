package com.hw.biz.dao;

import com.hw.biz.model.AccountTallyDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountTallyDAO {

    int insert(AccountTallyDO accountTallyDO);

}
