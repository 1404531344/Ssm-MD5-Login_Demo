package com.fz.dao;

import com.fz.entity.User;

import java.util.List;

public interface UserDao {

//    查询所有
    List<User> findUserAll();
    //    增加
    int addUser(User user);

//根据用户名和密码查询
    User findUserByPassWord(User user);


}
