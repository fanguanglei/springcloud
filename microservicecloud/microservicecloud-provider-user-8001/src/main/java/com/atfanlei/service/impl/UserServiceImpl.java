package com.atfanlei.service.impl;

import com.atfanlei.dao.UserDao;
import com.atfanlei.entity.UserInfoEntity;
import com.atfanlei.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description //TODO
 * @Author fgl
 * @Date 2019/10/3114:31
 * @Version 1.0
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserInfoEntity> implements UserService {

   @Autowired
   private  UserDao userDao;
  @Override
  public List selectUserQx(List mid) {
    return userDao.selectUserQx(mid);
  }
}
