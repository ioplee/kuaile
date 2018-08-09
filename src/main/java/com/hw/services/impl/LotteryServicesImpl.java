package com.hw.services.impl;

import com.hw.biz.dao.LotteryDAO;
import com.hw.biz.model.LotteryDO;
import com.hw.biz.model.LotteryTypeDO;
import com.hw.services.LotteryServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LotteryServicesImpl implements LotteryServices {

    @Resource
    private LotteryDAO lotteryDAO;

    @Override
    public List<LotteryDO> findLotteryList(Long lotteryTypeId) {
        return null;
    }

    @Override
    public String findLastestNumber(Long lotteryTypeId) {
        return null;
    }

    @Override
    public LotteryDO findLotteryById(Long id) {
        return null;
    }

    @Override
    public void createLottery(LotteryTypeDO lotteryTypeDO) {

    }

    @Override
    public void modifyLottery(LotteryDO lotteryDO) {

    }

    @Override
    public void removeLottery(Long id) {

    }

}
