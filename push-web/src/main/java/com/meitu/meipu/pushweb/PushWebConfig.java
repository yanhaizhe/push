package com.meitu.meipu.pushweb;

import com.meitu.tardis.grpc.spring.GrpcServerFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/23 下午2:17
 * @Version 1.0
 **/
@Configuration
public class PushWebConfig {

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
}
