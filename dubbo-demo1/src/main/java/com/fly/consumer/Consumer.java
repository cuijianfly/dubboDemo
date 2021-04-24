package com.fly.consumer;

import com.fly.api.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        DubboService demoService = context.getBean("dubboService", DubboService.class); // 获取远程服务代理
        String hello = demoService.helloDubbo("tom"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果

        System.out.println(123);
        System.out.println(456);

        System.out.println("master 提交了代码");
        System.out.println("branch 提交了代码");
        System.out.println("master 提交了代码");

        System.out.println("branch2 提交了代码");
        System.out.println("master 提交了代码");
        
        System.out.println("master git修改了代码");
        
        System.out.println("001");
        System.out.println("003");

    }
}
