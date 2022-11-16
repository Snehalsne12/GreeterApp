package com.greeting.Service;

import com.greeting.Pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class GreetingService {



    public String displayGreeting(String name){
        LocalTime today = LocalTime.now();

        LocalTime morning= LocalTime.parse("06:00:00");
        LocalTime afternoon=LocalTime.parse("12:00:00");
        LocalTime evening=LocalTime.parse("17:00:00");
        LocalTime night = LocalTime.parse("22:00:00");

        String greet = "";
        if(today.isAfter(afternoon) && today.isBefore(evening)){
            greet += "Hello! Good Afternoon ";
        } else if (today.isAfter(morning) && today.isBefore(afternoon)) {
            greet += "Hello! Good Morning ";
        }else if((today.isAfter(evening) && today.isBefore(night)) ){
            greet += "Hello! Good Evening ";
        }
        else {
            greet += "Hello! Good Night ";
        }
        return greet + name;
    }
}
