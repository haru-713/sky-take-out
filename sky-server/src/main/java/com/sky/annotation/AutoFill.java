package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
* 自定义注解：用于标识某个方法需要进行功能字段自动填充的处理
* * */
@Target(ElementType.METHOD)// 指定注解的位置
@Retention(RetentionPolicy.RUNTIME)// 指定注解的保留位置
public @interface AutoFill {
    // 填充逻辑对应的数据库操作类型: INSERT UPDATE
    OperationType value();
}
