package com.zhaodf.beans;

import com.zhaodf.service.UserService;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;

import java.util.Map;

/**
 * 类：MyImportBeanDefinitionRegistrar
 *
 * @author zhaodf
 * @date 2021/2/23
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        GenericBeanDefinition beanDefinition=new GenericBeanDefinition();
        beanDefinition.setBeanClass(Teacher.class);
        registry.registerBeanDefinition("teacher",beanDefinition);
        GenericBeanDefinition beanDefinition2=new GenericBeanDefinition();
        beanDefinition2.setBeanClass(Student.class);
        registry.registerBeanDefinition("student",beanDefinition2);

//        //扫描注解
//        Map<String, Object> annotationAttributes = importingClassMetadata
//                .getAnnotationAttributes(ComponentScan.class.getName());
//        String[] basePackages = (String[]) annotationAttributes.get("basePackages");
//
//        //扫描类
//        ClassPathBeanDefinitionScanner scanner =
//                new ClassPathBeanDefinitionScanner(registry, false);
//
//        scanner.scan(basePackages);
    }
}
