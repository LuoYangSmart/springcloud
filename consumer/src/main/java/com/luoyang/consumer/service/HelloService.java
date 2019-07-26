package com.luoyang.consumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Auther: Luozhen
 * @Date: 2019/4/9 11:04
 * @Description:
 */
@Service
public class HelloService {
    private static final Logger LOG = Logger.getLogger(HelloService.class.getName());

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        LOG.log(Level.INFO,"hiService");
        return restTemplate.getForObject("http://provider/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi," + name + ",sorry error!";
    }
}
