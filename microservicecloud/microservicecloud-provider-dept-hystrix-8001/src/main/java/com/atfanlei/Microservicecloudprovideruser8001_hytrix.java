package com.atfanlei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan(basePackages = {"com.atfanlei.dao"}) //扫描DAO
public class Microservicecloudprovideruser8001_hytrix {
  public static void main(String[] args) {
    SpringApplication.run(Microservicecloudprovideruser8001_hytrix.class, args);
  }
}
