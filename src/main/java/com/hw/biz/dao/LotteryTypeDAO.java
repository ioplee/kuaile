package com.hw.biz.dao;

import com.hw.biz.model.LotteryTypeDO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface LotteryTypeDAO {

    @Results({
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_lottery_type WHERE id = #{id}")
    LotteryTypeDO findLotteryTypeById(@Param("id") Long id);

}
