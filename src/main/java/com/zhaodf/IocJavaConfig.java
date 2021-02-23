package com.zhaodf;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhaodf.beans.MyImportBeanDefinitionRegistrar;
import com.zhaodf.beans.MyImportSelector;
import com.zhaodf.beans.Role;
import com.zhaodf.beans.Student;
import com.zhaodf.beans.User;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * 类：IocJavaConfig
 *
 * @author zhaodf
 * @date 2021/2/22
 */
@Configuration
@ComponentScan(basePackages="com.zhaodf")
@PropertySource(value = {"classpath:db.properties"})
@Import(value = {MyImportBeanDefinitionRegistrar.class})
public class IocJavaConfig {
//    @Value("${mysql.driverClassName}")
//    private String driverClassName;
//    @Value("${mysql.url}")
//    private String url;
//    @Value("${mysql.username}")
//    private String username;
//    @Value("${mysql.password}")
//    private String password;
//
//    @Bean(name = {"abc","dataSource"})
//    @Scope("singleton")
//    public DruidDataSource dataSource(){
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(username);
//        dataSource.setPassword(password);
//        return dataSource;
//    }
//
//    @Bean
//    public User user(){
//        return new User();
//    }
}
