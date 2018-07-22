package com.hw.biz.dao;

import com.github.pagehelper.Page;
import com.hw.biz.model.LotteryDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LotteryDAO {

    int insert(LotteryDO lotteryDO);


    int delete(@Param("id") Long id);


    LotteryDO findLotteryById(@Param("id") Long id);


    int update(LotteryDO lotteryDO);


    Page<LotteryDO> findAllLotteryDescByPage();


}
