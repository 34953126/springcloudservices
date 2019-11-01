package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/10/21
 */
@Controller
public class IndexController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("client.do")
    @ResponseBody
    public String index(){
        ResponseEntity<String> result = restTemplate.getForEntity("http://microservice-srvic1/index.do",String.class);
        return result.getBody();
    }

}
