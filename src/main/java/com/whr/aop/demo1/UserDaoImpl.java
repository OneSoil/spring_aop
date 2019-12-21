package com.whr.aop.demo1;

/**
 * @author Mr.wang
 * @date 2019-03-01 16:40
 */
public class UserDaoImpl implements UserDao{
    public void add() {
        System.out.println("添加用户...");
    }

    public void delete() {
        System.out.println("删除用户...");
    }

    public void update() {
        System.out.println("修改用户...");
    }

    public void find() {
        System.out.println("查找用户...");
    }
}
