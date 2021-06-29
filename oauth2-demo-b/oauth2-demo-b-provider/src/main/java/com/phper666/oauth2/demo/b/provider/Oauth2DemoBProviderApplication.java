package com.phper666.oauth2.demo.b.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yuzhao.li
 * @email yuzhao.li@salesforce-china.com
 * @date 2020/10/13 3:41
 * @software IntelliJ IDEA
 */
@SpringBootApplication
@MapperScan({"com.phper666.oauth2.demo.b.provider.mapper"})
@EnableDiscoveryClient
public class Oauth2DemoBProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2DemoBProviderApplication.class, args);
    }
}

