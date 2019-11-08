package com.atfanlei.controller;

import com.atfanlei.entity.UserInfoEntity;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ConsumerController
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/115:31
 * @Version 1.0
 **/

@RestController
public class ConsumerController {

  private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-USER";
  @Autowired
  private RestTemplate restTemplate;

 @RequestMapping("/consumer/{mid}")
  public List getA(@PathVariable("mid") Integer mid){
    return (List) restTemplate.getForObject(REST_URL_PREFIX+"/findm/"+mid, List.class);
  }
  @RequestMapping("/consumer/faxian")
  public  Object discovery(){
   return restTemplate.getForObject(REST_URL_PREFIX+"/discovery",Object.class);
  }




}
