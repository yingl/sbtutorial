package com.sbt.l_001;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBeanWithParameters {
    private String name;
    private String value;

    public TestBeanWithParameters(@Value("${test.name}") String name,
                                  @Value("${test.value}") String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
