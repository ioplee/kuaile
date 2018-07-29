package com.hw.biz.dao;

import com.hw.biz.dao.provider.RankingDynaSqlProvider;
import com.hw.biz.model.RankingDO;
import org.apache.ibatis.annotations.*;

import java.util.List;

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

    @Update("UPDATE hw_ranking SET status=-1, gmt_modify=now() WHERE id=#{id}")
    int delete(@Param("id") Long id);

    /**
     * 根据类型查询排名情况
     * @param type
     * @return
     */
    @Results({
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_ranking WHERE type = #{type}")
    List<RankingDO> findRankingListByType(@Param("type") Integer type);

    @UpdateProvider(type=RankingDynaSqlProvider.class,method="updateRankingSql")
    int update(RankingDO rankingDO);

}