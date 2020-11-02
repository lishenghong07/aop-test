package com.qf.hong.aspectj;

import com.qf.hong.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        //创建类路径类对象
        ClassPathXmlApplicationContext pathXmlApplicationContext=new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        //通过类对象获取userService对象
        UserService userService = pathXmlApplicationContext.getBean("userService", UserService.class);
        //通过userService调用方法
        String register = userService.register();
        //输出
        System.out.println(register);
    }


}
