package com.example.service.impl;

import com.example.entity.User;
import com.example.entity.UserInfo;
import com.example.mapper.UserMapper;
import com.example.service.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoInterfaceImpl implements DemoInterface {
    @Autowired
    UserMapper userMapper;
    @Override
    public int testInterface() {
        return 0;
    }

    @Override
    public UserInfo getUserByName(String username) {
        return userMapper.findByName(username);
    }

    @Override
    public int insert(String username, String password) {
        return userMapper.insert(username,password);
    }
}
