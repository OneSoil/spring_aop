package com.whr.aop.demo5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Mr.wang
 * @date 2019-03-14 19:08
 * function_:基于Bean名称的自动代理
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class SpringDemo5 {

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Test
    public void demo1(){

        studentDao.find();
        studentDao.update();
        studentDao.delete();
        studentDao.add();

        customerDao.add();
        customerDao.delete();
        customerDao.update();
        customerDao.find();

    }
}
