package com.atfanlei;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.atfanlei.dao"}) //扫描DAO
public class MicroservicecloudProviderUser8002Application {

  public static void main(String[] args) {
    SpringApplication.run(MicroservicecloudProviderUser8002Application.class, args);
  }

}
