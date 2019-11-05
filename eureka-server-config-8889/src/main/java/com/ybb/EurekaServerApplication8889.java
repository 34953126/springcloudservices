package com.ybb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/2
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication8889 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication8889.class, args);
    }
}



