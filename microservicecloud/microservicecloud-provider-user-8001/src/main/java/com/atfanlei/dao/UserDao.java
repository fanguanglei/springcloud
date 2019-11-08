package com.atfanlei.dao;

import com.atfanlei.entity.UserInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName UserDao
 * @Description //TODO
 * @Author fgl
 * @Date 2019/10/3111:09
 * @Version 1.0
 **/

public interface UserDao extends BaseMapper<UserInfoEntity> {

    List selectUserQx( @Param("mid")List mid);
}
