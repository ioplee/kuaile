package com.hw.biz.dao;

import com.hw.biz.model.TargetDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeTargetDAOTest {

    @Resource
    private TypeTargetDAO typeTargetDAO;

    @Test
    public void testFindTargetListByTypeId() {
        List<TargetDO> targetDOList = typeTargetDAO.findTargetListByTypeId(1l);
        Assert.assertNotNull(targetDOList);
        Assert.assertTrue(targetDOList.size() > 0);
    }

}
