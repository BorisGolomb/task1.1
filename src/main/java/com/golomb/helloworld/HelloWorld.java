package com.golomb.helloworld;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {
    public static void main(String[] args) {
        String testString = "Hello, world";
        System.out.println(StringUtils.isNotBlank(testString));
    }
}
