package com.sbt.l_001;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class L001Application implements CommandLineRunner {
	@Autowired
	@Qualifier("XqqBean")
	private TestBean testBean;

	@Autowired
	private TestBeanWithParameters testBeanWithParameters;

	/*
	@Resource(name = "XqqBean")
	private TestBean testBean;
	 */

	public static void main(String[] args) {
		SpringApplication.run(L001Application.class, args);
	}

	@Override
	public void run(String... args) {
		testBean.sayHello();
		System.out.println(testBeanWithParameters.getName());
		System.out.println(testBeanWithParameters.getValue());
	}
}

