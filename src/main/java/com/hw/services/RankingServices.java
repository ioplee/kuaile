package com.hw.services;

import com.hw.biz.model.RankingDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 排行榜接口
 */
public interface RankingServices {

    public List<RankingDO> findRankingListByType(Integer type);

    public RankingDO findRankingById(Long id);

    public int insert(RankingDO rankingDO);

    public int delete(@Param("id") Long id);

    public int update(RankingDO rankingDO);

}
