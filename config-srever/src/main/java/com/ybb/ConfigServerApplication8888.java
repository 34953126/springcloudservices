package com.ybb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @EnableDiscoveryClient和@EnableEurekaClient
 * 共同点就是：都是能够让注册中心能够发现，扫描到改服务。
     不同点：@EnableEurekaClient只适用于Eureka作为注册中心，
            @EnableDiscoveryClient 可以是其他注册中心。
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/2
 */
@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
@EnableEurekaClient
public class ConfigServerApplication8888 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication8888.class,args);
    }
}
