package com.itheima.config;

import com.itheima.domain.Row;
import com.itheima.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将user注入到enable-other的容器里
 * @author SuoJiangTao
 */
@Configuration
public class UserConfig {
    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public Row row(){
        return new Row();
    }
}
