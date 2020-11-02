package com.qf.hong.dynamic;

import com.qf.hong.service.ShopService;
import com.qf.hong.service.UserService;
import com.qf.hong.service.impl.ShopServiceImpl;
import com.qf.hong.service.impl.UserServiceImpl;

//测试动态的代理
public class TestDynamic {
    public static void main(String[] args) {
        //创建代理类
        TransactionDynamicProxy dynamicProxy = new TransactionDynamicProxy();
        //通过代理的对象创建被代理对象
        UserService userService = (UserService) dynamicProxy.newInstance(new UserServiceImpl());
        //通过被代理的对象调用方法
        userService.login();
        //通过代理的对象创建被代理的对象
        ShopService shopService = (ShopService) dynamicProxy.newInstance(new ShopServiceImpl());
        //通过被代理的对象调用方法
        shopService.add();
    }
}
