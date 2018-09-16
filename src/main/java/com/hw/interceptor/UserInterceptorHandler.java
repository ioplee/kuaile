package com.hw.interceptor;

import com.hw.web.annotations.Menu;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器，没有登录信息得都拦截下来
 */
public class UserInterceptorHandler extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        boolean filter = false;
        if(handler instanceof HandlerMethod){
//            User user = (User) request.getSession(true).getAttribute(BMDataContext.USER_SESSION_NAME) ;
            HandlerMethod  handlerMethod = (HandlerMethod ) handler ;
            Menu menu = handlerMethod.getMethod().getAnnotation(Menu.class) ;
            if( /*user != null ||*/ (menu!=null && menu.access()) || handlerMethod.getBean() instanceof BasicErrorController){
                filter = true;
            }

            if(!filter){
                response.sendRedirect("/login.html");
            }
        }
        return filter ;
    }

    /**
     * 在切换到html页面进行渲染之前，将需要得全局数据出入到view得上下文中。
     * @param arg0 1
     * @param response 2
     * @param arg2 3
     * @param view 4
     * @throws Exception 5
     */
    public void postHandle(HttpServletRequest arg0, HttpServletResponse response, Object arg2,
                           ModelAndView view) throws Exception {
//        User user = (User) arg0.getSession().getAttribute(BMDataContext.USER_SESSION_NAME) ;
//        if( view!=null){
//            if(user!=null){
//                view.addObject("user", user) ;
//                view.addObject("schema",arg0.getScheme()) ;
//                view.addObject("hostname",arg0.getServerName()) ;
//                view.addObject("port",arg0.getServerPort()) ;
//
//                HandlerMethod  handlerMethod = (HandlerMethod ) arg2 ;
//                Menu menu = handlerMethod.getMethod().getAnnotation(Menu.class) ;
//                if(menu!=null){
//                    view.addObject("subtype", menu.subtype()) ;
//                    view.addObject("maintype", menu.type()) ;
//                    view.addObject("typename", menu.name()) ;
//                }
//                view.addObject("orgi", user.getOrgi()) ;
//            }
//
//            view.addObject("sessionid", UKTools.getContextID(arg0.getSession().getId())) ;
//            /**
//             * WebIM共享用户
//             */
//            User imUser = (User) arg0.getSession().getAttribute(BMDataContext.IM_USER_SESSION_NAME) ;
//            if(imUser == null && view!=null){
//                imUser = new User();
//                imUser.setUsername(BMDataContext.GUEST_USER) ;
//                imUser.setId(UKTools.getContextID(arg0.getSession(true).getId())) ;
//                imUser.setSessionid(imUser.getId()) ;
//                view.addObject("imuser", imUser) ;
//            }
//
//            if(arg0.getParameter("msg") != null){
//                view.addObject("msg", arg0.getParameter("msg")) ;
//            }
//            view.addObject("uKeFuDic", BeiMiDic.getInstance()) ;	//处理系统 字典数据 ， 通过 字典code 获取
//            SystemConfig systemConfig = (SystemConfig) CacheHelper.getSystemCacheBean().getCacheObject("systemConfig", BMDataContext.SYSTEM_ORGI) ;
//            if(systemConfig != null){
//                view.addObject("systemConfig", systemConfig)  ;
//            }else{
//                view.addObject("systemConfig", new SystemConfig())  ;
//            }
//            view.addObject("gameTypeList", BeiMiDic.getInstance().getDic(BMDataContext.BEIMI_SYSTEM_GAME_TYPE_DIC)) ;
//        }
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}
