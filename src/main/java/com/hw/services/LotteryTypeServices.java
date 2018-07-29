package com.hw.services;

import com.hw.biz.model.LotteryTypeDO;

import java.util.List;

public interface LotteryTypeServices {

    public List<LotteryTypeDO> findAllLotteryType();

    public LotteryTypeDO findLotteryTypeById(Long id);

    public List<LotteryTypeDO> findLotteryTypeByType(Integer type);

}
