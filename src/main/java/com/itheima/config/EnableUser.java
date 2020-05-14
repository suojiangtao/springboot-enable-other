package com.itheima.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author SuoJiangTao
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(UserConfig.class)
public @interface EnableUser {
}
