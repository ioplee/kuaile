package com.hw.services;

import com.hw.biz.model.LotteryDO;
import com.hw.biz.model.LotteryTypeDO;

import java.util.List;

/**
 * 每期彩票相关接口
 */
public interface LotteryServices {

    /**
     * 根据彩票类型ID查询最近50条彩票信息
     * @param lotteryTypeId
     * @return
     */
    public List<LotteryDO> findLotteryList(Long lotteryTypeId);

    public String findLastestNumber(Long lotteryTypeId);

    public LotteryDO findLotteryById(Long id);

    public void createLottery(LotteryTypeDO lotteryTypeDO);

    public void modifyLottery(LotteryDO lotteryDO);

    public void removeLottery(Long id);

}
