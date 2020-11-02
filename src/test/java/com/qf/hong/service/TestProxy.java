package com.qf.hong.service;

import com.qf.hong.service.impl.UserServiceImpl;
import com.qf.hong.service.proxy.UserServiceProxy;

public class TestProxy {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userService);
        proxy.login();
    }
}
