package com.meitu.meipu.pushweb.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.meipu.meitu.client.RpcClient;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/24 下午7:25
 * @Version 1.0
 **/

@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class RpcClientImpl implements RpcClient {
    @Override
    public String demo() {
        return "Hello,  (from Spring Boot)";
    }
}
