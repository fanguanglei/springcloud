package com.atfanlei.controller;

import com.atfanlei.entity.UserInfoEntity;
import com.atfanlei.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
  @RequestMapping(value = "/findm/{mid}",method = RequestMethod.GET)
  @HystrixCommand(fallbackMethod = "processHystrix_Get")
  public List findm(@PathVariable("mid") Integer mid){

    List<UserInfoEntity> list=userService.selectUserQx(mid);
    if(list.size()==0){
      throw new RuntimeException("没有"+mid+"的数据");
    }
    System.out.println(list.size());
    return list;
  }

  public List<UserInfoEntity> processHystrix_Get(@PathVariable("mid") Integer id){

    List<UserInfoEntity> list=new ArrayList();
    UserInfoEntity u=new UserInfoEntity();
    u.setUserName("没有该id对应的信息");
    u.setDbSource("没有对应的db");
    list.add(u);

    return list;

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
