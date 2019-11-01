package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/10/21
 */
@SpringBootApplication
@EnableEurekaClient
public class Application9092 {
    public static void main(String[] args) {
        SpringApplication.run(Application9092.class,args);
    }
}
