package com.hw.utils;/**
 * Created by robin on 2019/5/14.
 */

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * The type Md 5.
 *
 * @author: Robin
 * @create: 2019 -05-14 17:11
 * @description: MD5 工具类
 */
@Slf4j
public class MD5 {

    private static String key;

    /**
     * MD5方法
     *
     * @param text 明文
     * @return 密文 string
     * @throws Exception the exception
     */
    public static String md5(String text) throws Exception {
        //加密后的字符串
        String encodeStr= DigestUtils.md5Hex(text + key);
        log.debug("MD5加密后的字符串为:encodeStr="+encodeStr);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param md5  密文
     * @return true /false
     * @throws Exception the exception
     */
    public static boolean verify(String text, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if(md5Text.equalsIgnoreCase(md5))
        {
            log.debug("MD5验证通过");
            return true;
        }

        return false;
    }
}
