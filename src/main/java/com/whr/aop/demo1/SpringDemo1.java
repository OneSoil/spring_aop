package com.whr.aop.demo1;

import org.junit.Test;

/**
 * @author Mr.wang
 * @date 2019-03-01 16:42
 * function：测试JDk 动态代理的实现
 */
public class SpringDemo1 {

    @Test
    //    传统方式
    public void demo1(){
        UserDao userDao = new UserDaoImpl();
        userDao.add();
        userDao.delete();
        userDao.update();
        userDao.find();
    }

    @Test
    //     jdk动态代理
    public void demo2(){
        UserDao userDao = new UserDaoImpl();
        UserDao proxy = (UserDao) new MyJdkProxy(userDao).creatProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();
    }
}
