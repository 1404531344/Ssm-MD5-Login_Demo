package com.fz.service;

import com.fz.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface UserService {

    //    查询所有
    List<User> findUserAll();
    //    增加
    int addUser(User user);

    //根据用户名和密码查询
    User findUserByPassWord(User user);





}
