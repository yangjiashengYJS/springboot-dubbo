package com.boot.dao;


import com.boot.domain.User;

import java.util.List;
import java.util.Map;


public interface UserMapper {

    /**
     * 获取用户列表
     * 
     * @return
     */
    List<User> queryList(Map<String, String> map);
}
