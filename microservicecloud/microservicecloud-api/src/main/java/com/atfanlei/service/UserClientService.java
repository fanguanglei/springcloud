package com.atfanlei.service;

import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName UserClientService
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/510:26
 * @Version 1.0
 **/
@FeignClient(value = "MICROSERVICECLOUD-USER" ,fallbackFactory = UserClientServiceFallback.class)
public interface UserClientService {
  @RequestMapping(value = "/findm/{mid}",method = RequestMethod.GET)
  List selectUserQx(@PathVariable("mid") Integer mid);
}
