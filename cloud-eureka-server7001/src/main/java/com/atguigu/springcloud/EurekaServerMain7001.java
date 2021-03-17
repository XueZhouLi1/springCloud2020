package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Levi
 * @Classname EurekaServerMain7001
 * @Description EurekaServer启动类
 * @Date 2021/2/5 10:48
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerMain7001 {
    public static void main(String[] args){
        SpringApplication.run(EurekaServerMain7001.class, args);
    }
}
