package com.ybb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 写一个API接口“／hi”，返回从配置中心读取的foo变量的值
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/11/2
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication8881 {
    public static void main(String[] args) {
        SpringApplication.run(
                ConfigClientApplication8881.class,args
        );
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
