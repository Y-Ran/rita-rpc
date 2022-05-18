package com.yiran.ritarpc.proxy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@EnableAutoConfiguration
public class ProxyTest {

    @Autowired
    private HelloService helloService;

    @Test
    public void testHello() {
        System.out.println(helloService.hello("tom"));
    }

}
