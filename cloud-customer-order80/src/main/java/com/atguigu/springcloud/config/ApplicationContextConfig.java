package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Levi
 * @Classname ApplicationContextConfig
 * @Description TODO 注释
 * @Date 2021/2/4 14:31
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced
    /**
     * @Bean 这个注解，把这个方法注入到Spring容器内
     * @LoadBalanced 这个注解，就赋予了RestTemplate 负载均衡的能力
     * 轮询算法
     */
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
