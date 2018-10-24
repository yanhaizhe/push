package com.meipu.meitu.pushfront.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/24 下午3:08
 * @Version 1.0
 **/
@RestController
@RequestMapping("index")
public class IndexController {

    //    @Autowired
//    private RpcClient rpcClient;
//
    @GetMapping("/query")
    public Object query() {
        return "hello world";
    }
}
