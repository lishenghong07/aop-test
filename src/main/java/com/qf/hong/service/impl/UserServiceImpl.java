package com.qf.hong.service.impl;

import com.qf.hong.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String login() {
        System.out.println("去数据库查询用户表");
        return "核心方法";
    }

    @Override
    public String list() {
        return null;
    }

    @Override
    public String register() {
        System.out.println("核心方法");
        return "register";
    }
}
