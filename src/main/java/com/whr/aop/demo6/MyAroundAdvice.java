package com.whr.aop.demo6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author Mr.wang
 * @date 2019-03-13 16:33
 * function_:环绕通知
 */
public class MyAroundAdvice implements MethodInterceptor {

    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        System.out.println("环绕前增强===========");
        Object obj = methodInvocation.proceed();
        System.out.println("环绕后增强===========");
        return obj;
    }
}
