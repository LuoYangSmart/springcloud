package com.luoyang.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Auther: Luozhen
 * @Date: 2019/4/9 11:21
 * @Description:
 */
@RestController
public class HelloController {
    private static final Logger LOG = Logger.getLogger(HelloController.class.getName());


    @RequestMapping("/hi")
    public String sayHi(String name) {
        System.out.println(name + " hello world");
        LOG.log(Level.INFO,"sayHi");
        return name + " hello world";
    }

}
