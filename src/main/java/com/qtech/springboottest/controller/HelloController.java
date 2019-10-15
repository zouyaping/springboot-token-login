package com.qtech.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: ${description}
 * @Date: 2019/10/14 15:15
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/test")
public class HelloController {

    @RequestMapping("/getHello")
    public String getHello(){
        return "hello world!!!!";
    }
}
