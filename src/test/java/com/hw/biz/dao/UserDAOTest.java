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
        userDO.setPhone("13600000001");
        userDO.setNick("nainiu999");
        userDO.setPassword("12345678");
        //userDO.setPhone("1");
        //userDO.setNick("1");
        //userDO.setPassword("1");
        userDO.setType(0);
        int num = userDAO.insert(userDO);
        Assert.assertTrue(num > 0);
    }

    @Test
    public void testFindUserByPhoneAndPassword() {
        UserDO userDO = userDAO.findUserByPhoneAndPassword("13600000000","12345678");
        Assert.assertNotNull(userDO);
    }

    @Test
    public void testFindUserById() {
        UserDO userDO =  userDAO.findUserById(8l);
        Assert.assertNotNull(userDO);
    }

    @Test
    public void testUpdate() {
        UserDO userDO = new UserDO();
        userDO.setId(8l);
        userDO.setNick("martin999");
        userDO.setPassword("009900");
        userDO.setQq("85172930");
        userDO.setEmail("8517@qq.com");
        userDO.setType(1);
        userDO.setPhone("15924186666");
        userDO.setName("狐狸");
        userDO.setWeixinNick("猩猩");
        userDO.setSecretPassword("333222");
        userDO.setHeadImage("22");
        userDO.setWeixinOpenId("10002003");
        userDO.setStatus(1);
        int num = userDAO.update(userDO);
        Assert.assertTrue(num > 0);
    }

    @Test
    public void testDelete() {
        int num = userDAO.delete(11l);
        Assert.assertTrue(num > 0);
    }

}
