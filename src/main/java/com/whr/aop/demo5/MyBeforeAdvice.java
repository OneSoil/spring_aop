package com.whr.aop.demo5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author Mr.wang
 * @date 2019-03-12 22:23
 * function_:
 */
public class MyBeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置增强可以进行的操作==========");
    }
}
