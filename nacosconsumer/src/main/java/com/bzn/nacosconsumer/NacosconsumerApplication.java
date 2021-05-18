package com.bzn.nacosconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosconsumerApplication.class, args);
    }

    /**
     * Instantiate RestTemplate Instance
     * @return aa
     */
    @Bean
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
