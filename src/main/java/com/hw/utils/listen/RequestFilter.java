package com.hw.utils.listen;/**
 * Created by robin on 2019/4/24.
 */

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: Robin
 * @create: 2019-04-24 15:36
 * @description: 请求过滤器
 **/

@Slf4j
public class RequestFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.debug(request.getRemoteAddr());
        log.debug(request.getRemoteHost());
        log.debug(request.getCharacterEncoding());
        log.debug(request.getContentType());
        log.debug(request.getScheme());
    }

    @Override
    public void destroy() {

    }
}
