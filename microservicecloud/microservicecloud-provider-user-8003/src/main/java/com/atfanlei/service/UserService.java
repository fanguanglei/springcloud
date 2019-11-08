package com.atfanlei.service;

import com.atfanlei.entity.UserInfoEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;

/**
 * @ClassName UserService
 * @Description //TODO
 * @Author fgl
 * @Date 2019/10/3114:29
 * @Version 1.0
 **/
public interface UserService extends IService<UserInfoEntity> {

  List selectUserQx(Integer mid);

}
