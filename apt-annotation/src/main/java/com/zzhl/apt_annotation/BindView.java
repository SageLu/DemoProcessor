package com.zzhl.apt_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
     * @Retention： 定义被保留的时间长短
        RetentionPoicy.SOURCE、RetentionPoicy.CLASS、RetentionPoicy.RUNTIME
     @Target： 定义所修饰的对象范围
     TYPE、FIELD、METHOD、PARAMETER、CONSTRUCTOR、LOCAL_VARIABLE等

     https://juejin.im/entry/577142c3a633bd006435eea4
 */
@Retention(RetentionPolicy.CLASS) //在源码和字节码中可用
@Target(ElementType.FIELD)//表示注解范围为类成员（构造方法、方法、成员变量）
public @interface BindView {
    int value();
}