package com.ybb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2019/11/1.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ServiceZuulApplication8769 {
    public static void main(String[] args) {
        SpringApplication.run( ServiceZuulApplication8769.class, args );
    }
}
