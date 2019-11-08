package com.atfanlei.configBean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConfigBean
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/115:33
 * @Version 1.0
 **/
@Configuration
public class ConfigBean {


  @Bean
  @LoadBalanced//SpringcloudRibbon是基于netFix Ribbon实现的一套客户端 负载均衡的工具 默认是轮询一个一个换着来
  public RestTemplate getRestTemplate(){

    return  new RestTemplate();
  }

  /*@Bean
  public IRule getRandomRule(){

   // return  new RandomRule();//随机选择
    return new RetryRule();
  }*/
}
