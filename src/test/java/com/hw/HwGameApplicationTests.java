package com.hw;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwGameApplicationTests {

//    @Resource
//    private UserMapper userMapper ;
//
//    @Resource
//    private UserServices userServices ;
//
//    @Test
//    public void contextLoads() {
//        Assert.assertNotNull(userMapper) ;
//        UserDomain user = new UserDomain() ;
//        user.setId(4);
//        user.setName("123456789");
//        user.setPassword("qwertyrui");
//        user.setPhone("13588739893");
//
//        int c = userMapper.insert(user) ;
//        Assert.assertTrue(c > 0);
//
//        UserDomain user1 = userMapper.findUserByPhone("13588739891") ;
//        Assert.assertNotNull(user1) ;
//
//        Page<UserDomain> page = userServices.findUserByPage(2,1) ;
//
//        Assert.assertTrue(page.getPages() > 1);
//
//        int d = userMapper.delete(user1) ;
//        Assert.assertTrue(d > 0);
//    }
//
//    @Test
//    public void testDynaSql() {
//        Map<String,String> params = new HashMap<>() ;
//        params.put("name","12345678") ;
//        params.put("phone","15924186666") ;
//
//        Page<UserDomain> list = userServices.findUserByPage(params,1,1) ;
//        Assert.assertEquals(list.getPages(), 1);
//    }

}
