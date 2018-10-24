package com.meitu.meipu.pushweb.rpc;

import com.meipu.meitu.client.RpcClient;
import com.meitu.tardis.spring.annotations.JrpcService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/23 下午11:18
 * @Version 1.0
 **/
@Service("rpcClient")
@JrpcService
public class RpcClientImpl implements RpcClient {
    @Override
    public String demo() {
        return "hello word";
    }
}
