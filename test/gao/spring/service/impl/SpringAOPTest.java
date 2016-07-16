package gao.spring.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import gao.spring.service.PersonService;

public class SpringAOPTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMyInterceptor() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService = (PersonService) applicationContext.getBean("personService");
		personService.save("xxx");
	}

}
