package com.jk.dao;

import com.jk.entity.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface UserBeanMapper {
    int deleteByPrimaryKey(Integer userId);

    void insert(@RequestBody UserBean user);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(@RequestParam Integer userId);

    void updateByPrimaryKeySelective(@RequestBody UserBean user);

    int updateByPrimaryKey(UserBean record);

    Long count();

    List<UserBean> findPage(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    void del(@RequestParam String[] userId);

    void xiu(@RequestParam Integer userId, @RequestParam Integer userStatus);
}
