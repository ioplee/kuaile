package com.hw.biz.dao;

import com.github.pagehelper.Page;
import com.hw.biz.model.DetailedDividendDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DetailedDividendDAO {

    int insert(DetailedDividendDO detailedDividendDO);

    /**
     * 根据代理商ID查询分红明细数据
     * @param userId
     * @return
     */
    Page<DetailedDividendDO> findDetailedDividendPageByUserId(Long userId);

}
