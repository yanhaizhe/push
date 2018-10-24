package com.meitu.meipu.pushweb;

import com.meipu.meitu.client.RpcClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PushWebApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PushWebApplication.class, args);
        RpcClient rpcClient = context.getBean(RpcClient.class);
        rpcClient.demo();
    }
}
