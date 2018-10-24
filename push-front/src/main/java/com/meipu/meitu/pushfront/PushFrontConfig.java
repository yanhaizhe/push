package com.meipu.meitu.pushfront;

import com.meipu.meitu.client.RpcClient;
import com.meitu.tardis.grpc.client.ClientOptions;
import com.meitu.tardis.grpc.spring.GrpcServerFactoryBean;
import com.meitu.tardis.grpc.spring.JrpcStubFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/24 下午3:55
 * @Version 1.0
 **/
@Configuration
//@ImportResource("classpath:cms-tardis-consumer.xml")
public class PushFrontConfig {

    @Value("${tardis.etcdUri}")
    private String etcdUrl;

    @Value("${tardis.serviceName}")
    private String serviceName;

    @Value("${tardis.provider.online}")
    private Boolean onlineWhenStartup;

    @Value("${tardis.group}")
    private String groupName;

    @Value("${tardis.region}")
    private String regionName;

    @Bean
    public GrpcServerFactoryBean grpcServerFactoryBean() {
        return new GrpcServerFactoryBean(etcdUrl.split(","), serviceName, groupName, regionName, onlineWhenStartup);
    }

    @Bean
    public ClientOptions clientOptions() {
        return new ClientOptions(etcdUrl.split(","));
    }

//    @Bean("rpcClient")
//    public JrpcStubFactoryBean rpcClient() {
//        return new JrpcStubFactoryBean(RpcClient.class, clientOptions());
//    }

}
