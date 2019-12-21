package com.whr.aop.demo6;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Mr.wang
 * @date 2019-03-14 19:32
 * function_:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext4.xml")
public class SpringDemo6 {

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Resource(name = "studentDao")
    private StudentDao studentDao;

    @Test
    public void demo1(){
        customerDao.add();
        customerDao.delete();
        customerDao.update();
        customerDao.find();

        studentDao.update();
        studentDao.add();
        studentDao.delete();
        studentDao.find();
    }
}
