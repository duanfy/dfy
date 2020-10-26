package com.jk.controller;

import com.jk.entity.UserBean;
import com.jk.pojo.PageResult;
import com.jk.pojo.RedisContent;
import com.jk.service.UserService;
import com.jk.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtil redisUtil;

    @RequestMapping("select")
    @ResponseBody
    public PageResult select(Integer currPage, Integer pageSize){
        PageResult chaxun = (PageResult) redisUtil.get(RedisContent.USER_LIST_KEY);
        if (chaxun==null){
            PageResult select = userService.select(currPage, pageSize);
            chaxun=select;
            redisUtil.set(RedisContent.USER_LIST_KEY, select);
            // 设置key的过期时间
            redisUtil.expire(RedisContent.USER_LIST_KEY, 60);
        }
        return chaxun;
    }


    @RequestMapping("insert")
    @ResponseBody
    public void insert(UserBean user){
        redisUtil.del(RedisContent.USER_LIST_KEY);
        userService.insert(user);
    }


    @RequestMapping("del")
    @ResponseBody
    public void del(String[] userId){
        redisUtil.del(RedisContent.USER_LIST_KEY);
        userService.del(userId);
    }


    @RequestMapping("huix")
    @ResponseBody
    public UserBean huix(Integer userId){
        return userService.huix(userId);
    }


    @RequestMapping("xiu")
    @ResponseBody
    public void xiu(Integer userId,Integer userStatus){
        redisUtil.del(RedisContent.USER_LIST_KEY);
        userService.xiu(userId,userStatus);
    }


    @RequestMapping("index")
    public String index(){
        return "show";
    }

}
