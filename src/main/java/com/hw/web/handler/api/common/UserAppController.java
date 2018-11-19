package com.hw.web.handler.api.common;

import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSONObject;
import com.hw.biz.model.UserDO;
import com.hw.biz.model.common.ResultDO;
import com.hw.services.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserAppController {

	@Resource
	private UserServices userServices;

	@RequestMapping(value = "/api/common/findUserInfoByKey", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String findUserInfoByKey(HttpServletRequest request, HttpServletResponse response) {
		String key = request.getParameter("key");
		ResultDO<UserDO> resultDO = userServices.findUserResultById(new Long(key));
		String userInfo = JSONObject.toJSON(resultDO).toString();
		return userInfo;
	}

}
