package com.zhaodf.beans;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 类：MyImportSelector
 *
 * @author zhaodf
 * @date 2021/2/23
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 可以以字符串的形式注册多个Bean
        // 字符串必须是类的完整限定名  getBean不能根据名字获取获取的， 必须要根据类型获取
        return new String[]{"com.zhaodf.beans.Teacher",Student.class.getName()};
    }
}
