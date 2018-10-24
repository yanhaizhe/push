package com.meipu.meitu.pushfront;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @Description 项目以war包形式来启动过时，需要实现此类
 * @Author yhz
 * @Date 2018/10/23 上午11:31
 * @Version 1.0
 **/
public class SpringBootStartApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(PushFrontApplication.class);
    }
}
