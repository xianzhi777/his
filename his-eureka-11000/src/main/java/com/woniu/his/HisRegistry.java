package com.woniu.his;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 功能描述:<br>
 * 〈〉
 *
 * @author EDZ
 * @create 2019/11/19
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer
public class HisRegistry {
    public static void main(String[] args) {
        SpringApplication.run(HisRegistry.class,args);
    }
}
