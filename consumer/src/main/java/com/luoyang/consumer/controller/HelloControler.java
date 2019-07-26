package com.luoyang.consumer.controller;

import com.luoyang.consumer.client.HelloServiceClient;
import com.luoyang.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Luozhen
 * @Date: 2019/4/9 11:05
 * @Description:
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @Autowired
    HelloServiceClient helloServiceClient;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping("/hello")
    public String hello(@RequestParam String name){
        return helloServiceClient.sayHi(name);
    }

}
