package com.hw.services.impl;

import com.hw.biz.dao.LotteryTypeDAO;
import com.hw.biz.model.LotteryTypeDO;
import com.hw.services.LotteryTypeServices;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LotteryTypeServicesImpl implements LotteryTypeServices {

    @Resource
    private LotteryTypeDAO lotteryTypeDAO;

    @Override
    public List<LotteryTypeDO> findAllLotteryType() {
        return null;
    }

    @Override
    public LotteryTypeDO findLotteryTypeById(Long id) {
        return null;
    }

    @Override
    public List<LotteryTypeDO> findLotteryTypeByType(Integer type) {
        return null;
    }

    @Override
    public List<LotteryTypeDO> findTypeNameByLotteryType() {
        return null;
    }

}
