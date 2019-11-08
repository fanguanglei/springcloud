package com.atfanlei.controller;

import com.atfanlei.entity.UserInfoEntity;
import com.atfanlei.service.UserClientService;
import feign.RequestLine;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

  @Autowired
  private UserClientService service;


  @RequestMapping(value = "/findm/{mid}")
  public  List getFeign(@PathVariable("mid") Integer id){
    return this.service.selectUserQx(id);
  }



}
