package com.hw.web.handler;

import com.hw.web.annotations.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@Controller
public class LoginController {
    @RequestMapping(value = "/login" , method = {RequestMethod.GET,RequestMethod.POST})
    @Menu(type = "apps" , subtype = "user" , access = true)//access==true时，不做校验
    public String login(HttpServletRequest request, HttpServletResponse response  , @RequestHeader(value = "referer", required = false) String referer , @Valid String msg) {
        return "admin/index" ;
    }

    @RequestMapping(value = "/testInfo")
    @ResponseBody
    public String testInfo() {
        return "hello 猩猩" ;
    }

    @RequestMapping(value = "/index" , method = {RequestMethod.GET,RequestMethod.POST})
    @Menu(type = "apps" , subtype = "user" , access = true)//access==true时，不做校验
    public String index(Model model, HttpServletRequest request, HttpServletResponse response  , @RequestHeader(value = "referer", required = false) String referer , @Valid String msg) {
        model.addAttribute("hello","打个招呼，你好，世界！") ;
        return "index" ;
    }
}
