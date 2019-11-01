package com.ybb.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ybb on 2019/11/1.
 */
@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    /**
     * 该注解对该方法创建了熔断器的功能，并指定了fallbackMethod熔断方法
     * 熔断方法直接返回了一个字符串,字符串为"hi,"+name+",sorry,error!"，
     * @param name
     * @return
     */
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        System.out.println("service-ribbon 测试中......");
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }


    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
