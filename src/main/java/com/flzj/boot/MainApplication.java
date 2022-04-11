package com.flzj.boot;

import com.flzj.boot.bean.User01;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        System.out.println(run.containsBean("user01"));
        System.out.println(run.containsBean("com.flzj.boot.bean.User01"));
        System.out.println(run.containsBean("pet01"));
        System.out.println(run.containsBean("tom"));
    }
}
