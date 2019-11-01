package com.ybb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**多次访问http://localhost:8765/hi?name=ybb,浏览器交替显示
 * hi ybb,i am from port:8762
   hi ybb,i am from port:8763
 * Created by ybb on 2019/11/1.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication8765 {
    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication8765.class,args);
    }

}
