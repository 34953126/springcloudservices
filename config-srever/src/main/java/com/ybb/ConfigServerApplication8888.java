package com.ybb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Description
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/2
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication8888 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication8888.class,args);
    }
}
