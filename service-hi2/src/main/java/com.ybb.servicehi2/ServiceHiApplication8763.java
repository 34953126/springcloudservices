package com.ybb.servicehi2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * port:8763
 * Created by ybb on 2019/11/1.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceHiApplication8763 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication8763.class,args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "ybb") String name) {
        return "hi " + name + ",I am from port:" + port;
    }
}
