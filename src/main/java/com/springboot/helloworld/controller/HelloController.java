package com.springboot.helloworld.controller;

import com.springboot.helloworld.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*使用restController 相当于同时在类上使用@Controller和@ResponseBody两个注解*/
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping(value = "/hello" )
    public String hello() {

        System.out.println(person.toString());

        return "hello world";

    }
}
