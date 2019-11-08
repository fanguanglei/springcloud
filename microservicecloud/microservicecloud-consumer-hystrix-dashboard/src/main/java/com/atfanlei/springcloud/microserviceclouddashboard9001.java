package com.atfanlei.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @ClassName microserviceclouddashboard9001
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/714:40
 * @Version 1.0
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class microserviceclouddashboard9001 {

  public static void main(String args[]){
    SpringApplication.run(microserviceclouddashboard9001.class);

  }

}
