package com.boot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.boot.dao.UserMapper;
import com.boot.domain.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> queryList(Map<String,String> map){

        return userMapper.queryList(map);
    }
}

