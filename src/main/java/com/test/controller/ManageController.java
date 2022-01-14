package com.test.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.test.po.Manage;
import com.test.service.ManageService;
import com.test.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 登录相关的控制器
 */
@Controller
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private ManageService service;

    /**
     * 管理员登录
     * @return
     */
    @RequestMapping("/login")
    public String login(){

        return "manage/login";
    }

    /**
     * 登录验证
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(Manage manage, Model model){
        Manage manage1 = service.getByEntity(manage);

        if(manage1==null){
            return "redirect:/manage/mExit";
        }
        model.addAttribute(Consts.MANAGE,manage1);

        return "manage/index";
    }

    /**
     * 管理员退出
     */
    @RequestMapping("mExit")
    public String mExit(HttpServletRequest request){

        //清空session中的管理员
        request.getSession().setAttribute(Consts.MANAGE,null);

        return "manage/login";
    }

}
