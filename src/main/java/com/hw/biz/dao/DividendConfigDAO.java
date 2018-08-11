package com.hw.biz.dao;

import com.hw.biz.model.DividendConfigDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DividendConfigDAO {

    /**
     * 根据代理商ID查询分红配置信息
     * @param userId
     * @return
     */
    List<DividendConfigDO> findDividendConfigListByUserId(Long userId);

    /**
     * 查询总代分红配置信息
     * @return
     */
    List<DividendConfigDO> findAllDividendConfigList();

}
