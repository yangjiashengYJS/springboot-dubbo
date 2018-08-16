package com.boot.service;

import com.boot.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    List<User> queryList(Map<String, String> map);
}