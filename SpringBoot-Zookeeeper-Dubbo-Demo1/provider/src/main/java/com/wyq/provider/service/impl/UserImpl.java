package com.wyq.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wyq.common.domin.User;
import com.wyq.common.service.UserService;
import com.wyq.provider.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName UserImpl
 * @Description: //TODO 接口实现类
 * @Author wyq
 * @Date 2022/4/1 20:14
 */
@Service(version = "1.0.0")
public class UserImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser() {
        return userMapper.getOne(1L);
    }
}
