package com.hw.utils;/**
 * Created by robin on 2019/3/5.
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;

/**
 * The type Properties copy util.
 *
 * @author: Robin
 * @create: 2019 -03-05 21:38
 * @description: 对象之间的属性拷贝工具
 */
@Slf4j
public class PropertiesCopyUtil {

    /**
     * Copy properties t.
     *
     * @param <T>    the type parameter
     * @param source 源对象
     * @param clazz  目标类
     * @return 目标对象实例 T 返回类型
     * @Title: copyProperties
     * @Description: 属性复制
     */
    @SuppressWarnings("deprecation")
    public static <T> T copyProperties(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }
        try {
            T target = BeanUtils.instantiate(clazz);
            BeanUtils.copyProperties(source, target);
            return target;
        } catch (Exception e) {
            log.error("#PropertiesCopyUtil called copyProperties error#", e);
        }
        return null;
    }




}

