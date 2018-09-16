package com.hw.web.handler;

import com.hw.web.annotations.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class LoginController {
    @RequestMapping(value = "/login" , method = {RequestMethod.GET,RequestMethod.POST})
    @Menu(type = "apps" , subtype = "user" , access = true)//access==true时，不做校验
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response  , @RequestHeader(value = "referer", required = false) String referer , @Valid String msg) {
        ModelAndView view = new ModelAndView("redirect:/") ;//先设定一个跳转到默认页面得view，当登录不成功时直接跳转到这个页面
        return view ;
    }
}
