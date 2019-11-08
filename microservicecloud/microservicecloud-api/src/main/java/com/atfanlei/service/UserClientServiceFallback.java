package com.atfanlei.service;

import com.atfanlei.entity.UserInfoEntity;
import feign.hystrix.FallbackFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @ClassName UserClientServiceFallback
 * @Description //TODO
 * @Author fgl
 * @Date 2019/11/516:12
 * @Version 1.0
 **/
@Component
public class UserClientServiceFallback implements FallbackFactory<UserClientService> {

  @Override
  public UserClientService create(Throwable throwable) {
    return new UserClientService() {
      @Override
      public List selectUserQx(Integer mid) {
        List<UserInfoEntity> list=new ArrayList();
        UserInfoEntity u=new UserInfoEntity();
        u.setUserName("没有该id对应的信息");
        u.setDbSource("没有对应的db");
        list.add(u);
        return list;
      }
    };
  }
}
