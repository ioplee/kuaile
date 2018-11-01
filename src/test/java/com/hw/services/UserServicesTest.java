package com.hw.services;


import com.hw.biz.model.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServicesTest {

	@Resource
	private UserServices userServices;

	@Test
	public void testCreateUser() {
		UserDO userDO = new UserDO();
		userDO.setNick("test_service_001");
		userDO.setPassword("12345678");
		userDO.setPhone("13600000002");
		userDO.setEmail("test@163.com");
		userDO.setQq("000111");
		userDO.setSecretPassword("88888888");
		userDO.setAlipayId("13600003456@vip.163.com");
		userDO.setWeixinOpenId("aedsbid-da0fafa23");
		userDO.setWeixinNick("大猩猩");
		userDO.setHeadImageUrl("http://img.177pic.info/uploads/2018/09b/b001-314.jpg");
		userDO.setType(0);
		userDO.setCaiPiaoFanDian(8);
		userDO.setPeiLv(1980);
		userDO.setStatus(1);
		userDO.setBack("service测试看看");
		userServices.createUser(userDO);
	}

}
