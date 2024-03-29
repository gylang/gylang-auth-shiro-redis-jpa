package com.gylang.gylangauthshirojpa.target;

import java.lang.annotation.*;

/**
 * @author gylang,
 * @data 2019/11/24 13:44,
 * @DESC
 */
@Target(ElementType.METHOD)          //注解放置的目标位置,METHOD是可注解在方法级别上
@Retention(RetentionPolicy.RUNTIME) //注解在哪个阶段执行
@Documented
public @interface IdArgs {

    boolean deptId() default true;
    boolean name() default true;
}
