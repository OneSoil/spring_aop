package com.whr.aop.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Mr.wang
 * @date 2019-03-01 16:47
 */
public class MyJdkProxy implements InvocationHandler{
    private UserDao userDao ;

    public MyJdkProxy(UserDao userDao){
        this.userDao = userDao;
    }

    public Object creatProxy(){
        /*
            三个参数：类加载器、实现的接口、InvocationHandler接口
         */
        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if("add".equals(method.getName())){
            System.out.println("权限检验...");
            return method.invoke(userDao,args);
        }
        return method.invoke(userDao,args);
    }
}
