package com.test.controller;

import com.test.po.Manage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping("/test")
    public @ResponseBody Object test1(){

        List<Manage> list = new ArrayList<>();
        list.add(new Manage("1","zhangsan","111","zhangsan"));
        list.add(new Manage("2","lisi","111","lisi"));
        list.add(new Manage("3","wangwu","111","wangwu"));
        list.add(new Manage("4","zhaoliu","111","zhaoliu"));

        return list;
    }

    @RequestMapping("/index")
    public String index(){

        return "test";
    }
}
