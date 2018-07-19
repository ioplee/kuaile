package com.hw.biz.dao;

import com.hw.biz.model.ExternalLotteryDO;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ExternalLotteryDAO {

    @Results({
            @Result(property = "gmtModify", column = "gmt_modify"),
            @Result(property = "gmtCreate", column = "gmt_create")
    })
    @Select("SELECT * FROM hw_external_lottery WHERE id = #{id}")
    ExternalLotteryDO findExternalLotteryById(@Param("id") Long id);

}
