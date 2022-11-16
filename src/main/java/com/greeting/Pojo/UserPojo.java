package com.greeting.Pojo;

import com.greeting.Service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;


public class UserPojo {

    @Autowired
    private GreetingService service;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserPojo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserPojo{" +
                "name='" + name + '\'' +
                '}';
    }

}
