package com.whr.aop.demo2;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Mr.wang
 * @date 2019-03-12 20:08
 * function_:
 */
public class MyCglibProxy implements org.springframework.cglib.proxy.MethodInterceptor {

    private ProductDao productDao;

    public MyCglibProxy(ProductDao productDao){
        this.productDao = productDao;
    }

    public Object creatProxy(){
        //1.创建核心类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(productDao.getClass());
        //3.设置回调
        enhancer.setCallback(this);
        //4.生成代理
        Object proxy = enhancer.create();
        return proxy;
    }

    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if("add".equals(method.getName())){
            System.out.println("权限校验===========");
            return methodProxy.invokeSuper(proxy,args);
        }
        return methodProxy.invokeSuper(proxy,args);
    }
}
