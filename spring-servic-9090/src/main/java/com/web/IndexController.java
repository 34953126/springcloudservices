package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 微服务端口9090
 * @Description
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/10/20
 */
@Controller
public class IndexController {

    @RequestMapping("index.do")
    @ResponseBody
    public String index(){
        return "服务端口号：9090";
    }

}
