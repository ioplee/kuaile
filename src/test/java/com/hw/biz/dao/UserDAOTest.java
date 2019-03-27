package com.hw.biz.dao;

import com.hw.biz.model.UserDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {

    @Resource
    private UserDAO userDAO;

    @Test
    public void testInsert() {
        UserDO userDO = new UserDO();
        userDO.setNick("test_001");
        userDO.setPassword("12345678");
        userDO.setPhone("13600000001");
        userDO.setEmail("test@163.com");
        userDO.setQq("12432123");
        userDO.setSecretPassword("88888888");
        userDO.setAlipayId("13600003456@vip.163.com");
        userDO.setWeixinOpenId("aedsbid-da0fafa23");
        userDO.setWeixinNick("大猩猩");
        userDO.setHeadImageUrl("http://img.177pic.info/uploads/2018/09b/b001-314.jpg");
        userDO.setType(0);
        userDO.setCaiPiaoFanDian(8);
        userDO.setPeiLv(1980);
        userDO.setStatus(1);
        userDO.setBack("测试看看");
        int num = userDAO.insert(userDO);
        Assert.assertTrue(num > 0);
    }

    @Test
    public void testFindUserByNickAndPassword() {
        UserDO userDO = userDAO.findUserByNickAndPassword("13600000001","12345678");
        Assert.assertNotNull(userDO);
    }

    @Test
    public void testFindUserById() {
        UserDO userDO =  userDAO.findUserById(1l);
        Assert.assertNotNull(userDO);
    }

    @Test
    public void testUpdate() {
        UserDO userDO = userDAO.findUserById(1l);
        if(null != userDO) {
            userDO.setUuid("90faf80erdafader932");
            userDO.setNick("martin999");
            userDO.setPassword("009900");
            userDO.setQq("85172930");
            userDO.setEmail("8517@qq.com");
            userDO.setType(1);
            userDO.setPhone("15924186666");
            userDO.setWeixinNick("猩猩");
            userDO.setSecretPassword("333222");
            userDO.setWeixinOpenId("10002003");
            userDO.setStatus(1);
        }
        int num = userDAO.update(userDO);
        Assert.assertTrue(num > 0);
    }

    @Test
    public void testDelete() {
        int num = userDAO.delete(1l);
        Assert.assertTrue(num > 0);
    }

}
