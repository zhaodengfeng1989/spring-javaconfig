package com.zhaodf;

import com.alibaba.druid.pool.DruidDataSource;
import com.zhaodf.beans.Role;
import com.zhaodf.beans.Student;
import com.zhaodf.beans.Teacher;
import com.zhaodf.beans.User;
import com.zhaodf.controller.UserController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 类：JavaConfigTest
 *
 * @author zhaodf
 * @date 2021/2/22
 */
public class JavaConfigTest {
    AnnotationConfigApplicationContext ioc;

    @Before
    public void before(){
        ioc = new AnnotationConfigApplicationContext(IocJavaConfig.class);
    }

    @Test
    public  void test01(){
        UserController bean = ioc.getBean(UserController.class);
        bean.getUser();
    }

    @Test
    public  void test02(){
        DruidDataSource bean = ioc.getBean("dataSource",DruidDataSource.class);
        System.out.println(bean.getUrl());
    }

    @Test
    public  void test03(){
        Role bean = ioc.getBean(Role.class);
        System.out.println(bean.getName());
    }

    @Test
    public  void test04(){
        User bean = ioc.getBean("user2",User.class);
        System.out.println(bean.getName());
    }

    @Test
    public  void test05(){
        Student bean = ioc.getBean(Student.class);
        System.out.println(bean);
    }

    @Test
    public  void test06(){
        Teacher bean = ioc.getBean(Teacher.class);
        System.out.println(bean);
        Student bean2 = ioc.getBean(Student.class);
        System.out.println(bean2);
    }
}
