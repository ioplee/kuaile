package com.hw.utils;/**
 * Created by robin on 2019/4/17.
 */

/**
 * @author: Robin
 * @create: 2019-04-17 15:07
 * @description: JWT 基础配置
 **/


public final class JWTConstant {

    public static final String AUDIENCE_CLIENT_ID = "hwgame";

    public static final String AUDIENCE_BASE64_SECRET = "MDk4ZjZiY2Q0NjIxZDM3M2NhZGU0ZTgzMjYyN2I0ZjY=";

    public static final String AUDIENCE_NAME = "token_check";

    /**
     * 5分钟刷新一次token
     */
    public static final long AUDIENCE_EXPIRES_SECOND = 5 * 60 * 1000;
}
