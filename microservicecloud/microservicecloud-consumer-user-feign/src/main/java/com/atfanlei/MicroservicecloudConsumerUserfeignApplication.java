package com.atfanlei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName MicroservicecloudConsumerUserfeignApplication
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/510:13
 * @Version 1.0
 **/
@SpringBootApplication(scanBasePackages = {"com.atfanlei"},exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.atfanlei"})
public class MicroservicecloudConsumerUserfeignApplication {
  public static void main(String[] args) {
    SpringApplication.run(MicroservicecloudConsumerUserfeignApplication.class, args);
  }
}
