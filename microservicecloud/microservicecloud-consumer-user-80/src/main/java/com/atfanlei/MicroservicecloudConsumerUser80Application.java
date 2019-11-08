package com.atfanlei;

import atfanlei.MyselRule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUD-USER",configuration = MyselRule.class)
public class MicroservicecloudConsumerUser80Application {
  public static void main(String[] args) {
    SpringApplication.run(MicroservicecloudConsumerUser80Application.class, args);
  }
}
