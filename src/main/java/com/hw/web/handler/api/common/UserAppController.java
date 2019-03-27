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
		return JSONObject.toJSON(resultDO).toString();
	}

	@RequestMapping(value = "/api/common/loginByPassword", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String loginByPassword(HttpServletRequest request, HttpServletResponse response) {
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		ResultDO<UserDO> resultDO = userServices.loginByPassword(nick, password);
		return JSONObject.toJSON(resultDO).toString();
	}

	@RequestMapping(value = "/api/common/register", method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String register(HttpServletRequest request, HttpServletResponse response) {
		String nick = request.getParameter("nick");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		String peiLv = "1900";
		String caiPiaoFanDian = "5";

		ResultDO<UserDO> resultDO = userServices.loginByPassword(nick, password);
		return JSONObject.toJSON(resultDO).toString();
	}

}
