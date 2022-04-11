package com.flzj.boot.controller;

import com.flzj.boot.bean.User01;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {
    @Autowired
    User01 user01;

    @RequestMapping("/w")
    public User01 handle02(){
        return user01;
    }


    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){
        log.info("请求进来辣.....");
        return "Hello Spring Boot!!" + name;
    }
}
