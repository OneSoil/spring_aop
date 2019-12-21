package com.whr.aop.demo2;

import org.junit.Test;

/**
 * @author Mr.wang
 * @date 2019-03-12 20:05
 * function_:
 */
public class SpringDemo2 {

    @Test
    public void demo1(){
        ProductDao productDao = new ProductDao();

        ProductDao proxy =(ProductDao) new  MyCglibProxy(productDao).creatProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.find();
    }
}
