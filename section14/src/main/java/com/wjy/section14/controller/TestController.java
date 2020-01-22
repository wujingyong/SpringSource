package com.wjy.section14.controller;

import com.wjy.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String test() {
        return "helloWorld";
    }

    @Autowired
    private HelloService helloService;

    @GetMapping("testStarter")
    public String testStarter() {
        return helloService.sayHello();
    }

}
