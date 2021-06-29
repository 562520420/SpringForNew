package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        BigDecimal num = new BigDecimal(-1);
        BigDecimal num1 = new BigDecimal(23);
        BigDecimal num2 = new BigDecimal(1);
        BigDecimal num3 = new BigDecimal(-1);
        String s = "{s}dsfdsf";
        String sf = ".";
//        System.out.println(num.compareTo(num1));
//        System.out.println(num.compareTo(num2));
//        System.out.println(num.compareTo(num3));
//        System.out.println(s.compareTo(sf));
        System.out.println(s.replace("{s}","猪头"));
    }

    
}
