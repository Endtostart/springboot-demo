package com.example.service;

import com.example.entity.UserInfo;

public interface DemoInterface {
    public int testInterface();
    public UserInfo getUserByName(String username);
    public int insert(String username,String password);
}
