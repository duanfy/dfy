package com.jk.service;

import com.jk.entity.UserBean;
import com.jk.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserService {

    PageResult select(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    void insert(@RequestBody UserBean user);

    void del(@RequestParam String[] userId);

    UserBean huix(@RequestParam Integer userId);

    void xiu(@RequestParam Integer userId, @RequestParam Integer userStatus);
}
