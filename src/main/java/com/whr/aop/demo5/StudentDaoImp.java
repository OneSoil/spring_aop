package com.whr.aop.demo5;

/**
 * @author Mr.wang
 * @date 2019-03-12 22:14
 * function_:aop的Advisor切面类型和增强类型
 */
public class StudentDaoImp implements StudentDao {

    public void add() {
        System.out.println("增...");
    }

    public void delete() {
        System.out.println("删...");
    }

    public void update() {
        System.out.println("改...");
    }

    public void find() {
        System.out.println("查...");
    }
}
