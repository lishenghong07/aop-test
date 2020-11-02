package com.qf.hong.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/*
* 生成.class
* */
public class CglibProxy implements MethodInterceptor {

    //代码生成器
   private Enhancer enhancer=new Enhancer();

    //创建一个获得proxy的方法
    public Object getProxy(Class<?> cls){
        enhancer.setSuperclass(cls);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    //获取被代理的对象
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开启事务");
        Object o1 = methodProxy.invokeSuper(o,objects);
        System.out.println("提交事务");
        return o1;
    }
}
