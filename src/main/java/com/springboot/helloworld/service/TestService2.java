package com.springboot.helloworld.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //标注这是一个配置类，类似于spring中的<beans><beans>配置
public class TestService2 {

    @Bean(name = "getBean")
    public TestService2 getBean() {
        return new TestService2();
    }

    public void test() {
        System.out.println("TestService2.test()......");
    }

}
