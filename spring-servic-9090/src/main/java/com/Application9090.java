package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 端口号9090
 * @Description
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/10/20
 */
@SpringBootApplication
@EnableEurekaClient
public class Application9090 {
    public static void main(String[] args) {
        SpringApplication.run(Application9090.class,args);
    }
}
