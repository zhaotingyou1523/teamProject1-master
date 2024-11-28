package com.koreait.coffee.controller;

import com.koreait.coffee.config.MysqlConfig;
import com.koreait.coffee.model.dto.User;
import com.koreait.coffee.model.mapper.UserMapper;

public class UserController {
    public UserMapper mapper = MysqlConfig.mysqlConnect().getMapper(UserMapper.class);
    public void addUser(User user) {
        mapper.insertUser(user);
    }
    public void updateUserByPhoneNumber(User user) {
        mapper.updateUserByPhoneNumber(user);
    }
}
