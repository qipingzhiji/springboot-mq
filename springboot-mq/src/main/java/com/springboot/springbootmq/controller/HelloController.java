package com.springboot.springbootmq.controller;

import com.springboot.springbootmq.mq.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @RequestMapping("/mq")
    public Email mqtest(Email email) {
        jmsTemplate.convertAndSend("mailbox", new Email("test", "this is a test message"));
        return email;
    }
}
