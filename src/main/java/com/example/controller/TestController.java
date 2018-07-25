package com.example.controller;

import com.example.service.DemoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    DemoInterface demoInterface;

    @RequestMapping("/num")
    @ResponseBody
    public int getNum() {
        return demoInterface.testInterface();
    }
}
