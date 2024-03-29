package com.hw.web.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by robin on 2019/4/16.
 */


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Menu {
    /**
     * 数据表名称注解，默认值为类名称
     * @return
     */
    public String type() default "className";

    public String subtype() default "methodName";

    public boolean access() default false;

    public boolean admin() default false;

    public String name() default "methodName";
}

