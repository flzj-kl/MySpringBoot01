package com.flzj.boot.bean;

import org.springframework.stereotype.Component;


public class Pet01 {
    private String name;

    public Pet01() {
    }

    public Pet01(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet01{" +
                "name='" + name + '\'' +
                '}';
    }
}
