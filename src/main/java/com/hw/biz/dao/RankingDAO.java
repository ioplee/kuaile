package com.hw.biz.dao;

import com.hw.biz.model.RankingDO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RankingDAO {

    @Results({
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_ranking WHERE id = #{id}")
    RankingDO findRankingById(@Param("id") Long id);

    @Insert("INSERT INTO hw_ranking(nick, jindou, reward, rank, type, status, gmt_create, gmt_modify) VALUES(#{nick}, #{jindou}, #{reward}, #{rank}, #{type}, #{status}, now(), now())")
    int insert(RankingDO rankingDO);

}
