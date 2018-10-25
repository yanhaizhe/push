package com.meitu.meipu.pushweb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.meipu.meitu.client.RpcClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/24 下午8:15
 * @Version 1.0
 **/
@RestController
public class DemoConsumerController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:12345")
    private RpcClient rpcClient;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return rpcClient.demo();
    }
}
