package com.spring.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xintianweng
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystixMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystixMain8001.class, args);
    }

}
