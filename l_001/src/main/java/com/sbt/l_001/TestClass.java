package com.sbt.l_001;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestClass {
    public TestClass() {
        System.out.println("Start spring boot container");
    }

    @Bean(name = "XqqBean", initMethod = "start", destroyMethod = "cleanUp")
    public TestBean testBean() {
        System.out.println("Create testBean");
        return new TestBean();
    }
}
