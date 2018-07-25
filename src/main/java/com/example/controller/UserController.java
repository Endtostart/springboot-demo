package com.example.controller;

import com.example.entity.UserInfo;
import com.example.service.DemoInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    //日志
    private final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    DemoInterface demoInterface;

    @RequestMapping("/get")
    @ResponseBody
    public UserInfo getUser(String name) {
        //测试数据
        name = "wang";
        log.info("UserController get user info");
        return demoInterface.getUserByName(name);
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add() {
        //测试数据
        String username = "wang";
        String password = "123456";
        demoInterface.insert(username, password);
        return "insert ok!";
    }


}
