package com.springboot.helloworld;

import com.springboot.helloworld.entity.Person;
import com.springboot.helloworld.service.TestService;
import com.springboot.helloworld.service.TestService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldApplicationTests {

	@Autowired
	private Person person;

	@Autowired
	private ApplicationContext ctx;

	@Test
	public void contextLoads() {
		System.out.println(person.toString());
	}

	@Test
	public void isContainsBean() {
		boolean b = ctx.containsBean("testService");
		if(b) {
			TestService testService = (TestService)ctx.getBean("testService");
			testService.doHello();
			System.out.println(System.currentTimeMillis());
		}
		System.out.println(b);
	}

	@Test
	public void isContainsBeanTest() {
		boolean test2 = ctx.containsBean("getBean");
		if (test2) {
			TestService2 getBean = (TestService2)ctx.getBean("getBean");
			getBean.test();
			System.out.println(System.currentTimeMillis());
		}

		System.out.println(test2);
	}

}
