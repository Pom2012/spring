package com.cydeo.been_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class CydeoApp {
    public static void main(String[] args) {

        ApplicationContext container=new AnnotationConfigApplicationContext(ConfigApp.class, ConfigAny.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createMentor();

        String str = container.getBean(String.class);
        System.out.println(str);

        Integer num = container.getBean(Integer.class);
        System.out.println(num);

        PartTimeMentor p1 = container.getBean(PartTimeMentor.class);
//        PartTimeMentor p2 = container.getBean("p2", PartTimeMentor.class);
        p1.createMentor();
    }
}
