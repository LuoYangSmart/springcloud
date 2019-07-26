package com.luoyang.consumer.hystric;

import com.luoyang.consumer.client.HelloServiceClient;
import org.springframework.stereotype.Component;

/**
 * @Auther: Luozhen
 * @Date: 2019/4/10 10:31
 * @Description:
 */
@Component
public class HelloServiceHystric implements HelloServiceClient {

    @Override
    public String sayHi(String name) {
        return "sorry " + name;
    }
}
