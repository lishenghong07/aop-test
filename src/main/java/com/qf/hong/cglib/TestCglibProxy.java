package com.qf.hong.cglib;

import com.qf.hong.service.impl.UserServiceImpl;

public class TestCglibProxy {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        UserServiceImpl userService = (UserServiceImpl) proxy.getProxy(new UserServiceImpl().getClass());
        String login = userService.login();
        System.out.println(login);
    }
}
