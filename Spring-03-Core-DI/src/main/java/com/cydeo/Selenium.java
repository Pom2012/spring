package com.cydeo;

import org.springframework.context.annotation.Bean;

public class Selenium {

    OfficeHours officeHours;
    @Bean
    public void getTeachingHours(){
        System.out.println("Weekly hours: "+(20+officeHours.getHours()));
    }
}
