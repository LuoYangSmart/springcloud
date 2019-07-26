package com.luoyang.consumer.client;

import com.luoyang.consumer.hystric.HelloServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: Luozhen
 * @Date: 2019/4/9 14:08
 * @Description:
 */
@FeignClient(value = "provider",fallback = HelloServiceHystric.class)
public interface HelloServiceClient {

    @RequestMapping("/hi")
    String sayHi(@RequestParam("name") String name);
}
