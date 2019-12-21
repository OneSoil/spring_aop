package com.whr.aop.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Mr.wang
 * @date 2019-03-12 22:42
 * function_:通过aop对目标类中所有方法进行增强
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

    //@Resource(name = "studentDao")
    @Resource(name = "studentDaoProxy")
    private StudentDao studentDao;

    @Test
    public void demo1(){
        studentDao.add();
        studentDao.delete();
        studentDao.update();
        studentDao.find();
    }

}
