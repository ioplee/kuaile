package com.hw.biz.dao;

import com.hw.biz.model.LotteryTypeDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryTypeDAOTest {

    @Resource
    private LotteryTypeDAO lotteryTypeDAO;

    @Test
    public void testFindLotteryTypeById() {
        LotteryTypeDO lotteryTypeDO = lotteryTypeDAO.findLotteryTypeById(1l);
        Assert.assertNotNull(lotteryTypeDO);
    }

}
