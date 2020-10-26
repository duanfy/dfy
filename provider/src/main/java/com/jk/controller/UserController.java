package com.jk.controller;

import com.jk.entity.UserBean;
import com.jk.pojo.PageResult;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("select")
    public PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize){
        return userService.select(currPage,pageSize);
    }


    @RequestMapping("insert")
    public void insert(@RequestBody UserBean user){
        userService.insert(user);
    }


    @RequestMapping("del")
    public void del(@RequestParam String[] userId){
        userService.del(userId);
    }


    @RequestMapping("huix")
    public UserBean huix(@RequestParam Integer userId){
        return userService.huix(userId);
    }


    @RequestMapping("xiu")
    public void xiu(@RequestParam Integer userId,@RequestParam Integer userStatus){
        userService.xiu(userId,userStatus);
    }
}
