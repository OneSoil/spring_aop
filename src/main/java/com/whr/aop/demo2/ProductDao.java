package com.whr.aop.demo2;

/**
 * @author Mr.wang
 * @date 2019-03-12 20:01
 * function_:CGLIB动态代理
 */
public class ProductDao {
    public void add(){
        System.out.println("增加产品...");
    }

    public void delete(){
        System.out.println("删除产品...");
    }

    public void update(){
        System.out.println("修改信息...");
    }

    public void find(){
        System.out.println("查找产品...");
    }

}
