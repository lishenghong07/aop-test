package com.qf.hong.service.proxy;

import com.qf.hong.service.UserService;
/*

静态代理：
* * 代理
 * 代理对象必须持有被代理对象的引用
 * 一个代理类只能带一个接口
*
* */
public class UserServiceProxy implements UserService {
    //创建被代理的对象
    private UserService userService;

    //获取被代理的对象
    public UserServiceProxy(UserService userService) {
        this.userService=userService;
    }

    //重写的的登录方法
    @Override
    public String login() {
        open();
        String login = userService.login();
        close();
        return login;
    }

    @Override
    public String list() {
        return null;
    }

    @Override
    public String register() {
        return null;
    }

    //打开数据库方法
    public void open(){
        System.out.println("连接数据库");
    }

    //关闭数据库方法
    public void close(){
        System.out.println("关闭数据库");
    }
}
