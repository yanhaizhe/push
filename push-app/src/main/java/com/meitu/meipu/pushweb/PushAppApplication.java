package com.meitu.meipu.pushweb;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PushAppApplication {


    public static void main(String[] args) {
        new SpringApplicationBuilder(PushAppApplication.class)
                .web(WebApplicationType.NONE) // 非 Web 应用
                .run(args);

//        SpringApplication.run(PushAppApplication.class, args);
    }
}
