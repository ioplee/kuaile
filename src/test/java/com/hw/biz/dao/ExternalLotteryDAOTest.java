package com.hw.biz.dao;

import com.hw.biz.model.ExternalLotteryDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ExternalLotteryDAOTest {

    @Resource
    private ExternalLotteryDAO externalLotteryDAO;

    @Test
    public void testFindExternalLotteryById() {
        ExternalLotteryDO externalLotteryDO = externalLotteryDAO.findExternalLotteryById(1l);
        Assert.assertNotNull(externalLotteryDO);
    }

}
