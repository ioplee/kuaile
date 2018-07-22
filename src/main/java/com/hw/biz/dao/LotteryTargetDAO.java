package com.hw.biz.dao;

import com.hw.biz.model.TargetDO;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.util.List;

@Mapper
public interface LotteryTargetDAO {

    /**
     * 根据每期彩票ID查询该期彩票投注项情况
     * @param lotteryId
     * @return
     */
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "targetName", column = "target_name"),
            @Result(property = "actualOdds", column = "actual_odds"),
            @Result(property = "totalJindou", column = "total_jindou"),
            @Result(property = "status", column = "status"),
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT b.id id, b.target_name target_name, a.actual_odds actual_odds, a.total_jindou total_jindou, b.status status, b.gmt_modify gmt_modfiy, b.gmt_create gmt_create" +
            " FROM hw_lottery_target a, hw_target b WHERE a.lottery_id = #{lotteryId} AND a.target_id = b.id AND a.status <> -1 AND b.status <> -1")
    List<TargetDO> findTargetListByLotteryId(@Param("lotteryId") Long lotteryId);


    int insert(@Param("lotteryId") Long lotteryId, @Param("targetId") Long targetId, @Param("actualOdds") Float actualOdds, @Param("totalJindou") Long totalJindou);


    int update(@Param("lotteryId") Long lotteryId, @Param("targetId") Long targetId, @Param("actualOdds") Float actualOdds, @Param("totalJindou") Long totalJindou);

}
