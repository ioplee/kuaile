package com.hw;

import com.hw.biz.dao.UserMapper;
import com.hw.biz.model.UserDomain;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwGameApplicationTests {

    @Resource
    private UserMapper userMapper ;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(userMapper) ;
        UserDomain user = new UserDomain() ;
        user.setId(2);
        user.setName("1234567");
        user.setPassword("qwertyr");
        user.setPhone("13588739891");

        int c = userMapper.insert(user) ;
        Assert.assertTrue(c > 0);

        UserDomain user1 = userMapper.findUserByPhone("13588739891") ;
        Assert.assertNotNull(user1) ;

        int d = userMapper.delete(user1) ;
        Assert.assertTrue(d > 0);
    }

}
