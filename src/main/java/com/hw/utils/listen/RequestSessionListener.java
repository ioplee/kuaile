package com.hw.utils.listen;/**
 * Created by robin on 2019/4/24.
 */

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author: Robin
 * @create: 2019-04-24 15:40
 * @description: 请求监听器
 **/

@Slf4j
public class RequestSessionListener implements HttpSessionListener{

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.debug("创建新的会话");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.debug("销毁一个会话");
    }
}
