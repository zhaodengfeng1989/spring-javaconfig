package com.zhaodf;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhaodf.beans.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * 类：IocJavaConfig
 *
 * @author zhaodf
 * @date 2021/2/22
 */
@Configuration
public class SecondIocJavaConfig {
    @Bean
    public User user2(){
        return new User();
    }
}
