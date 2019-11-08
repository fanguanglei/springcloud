package com.atfanlei.controller;

import com.atfanlei.entity.UserInfoEntity;
import com.atfanlei.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/19:14
 * @Version 1.0
 **/
@RestController
public class UserController {
  @Autowired
  private UserService userService;

  @Qualifier("discoveryClient")
  @Autowired
  private DiscoveryClient client;

  @RequestMapping(value = "/find")
  public List<UserInfoEntity> findAll(){

    return userService.list();
  }
  @RequestMapping(value = "/findm")
  public List findm(){
    List<Integer> mid=new ArrayList<>();
    mid.add(1);
     mid.add(2);
     mid.add(3);

    return userService.selectUserQx(mid);
  }

  @RequestMapping(value = "/discovery")
  public Object discovery(){
    List<String> list=client.getServices();
    System.out.println("list:"+list);

    List<ServiceInstance> service=client.getInstances("microservicecloud-user");
    for(ServiceInstance ele:service){
      System.out.println("id:"+ele.getServiceId());
    }
    return this.client;
  }
}
