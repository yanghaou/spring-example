package com.example.main;

import com.example.config.Config;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanMain {
    public static void main(String[] args) {
        //在spring上下文启动后就已经配置好所有的bean依赖了。
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println();
    }
}
