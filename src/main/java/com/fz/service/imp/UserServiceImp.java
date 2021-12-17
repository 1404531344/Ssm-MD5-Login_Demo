package com.fz.service.imp;

import com.fz.dao.UserDao;
import com.fz.entity.User;
import com.fz.service.UserService;
import com.fz.utils.Md5Utils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 *
 * 业务层
 * */
@Service
@Transactional
public class UserServiceImp implements UserService {

    final
    UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

//查询所有
    @Override
    public List<User> findUserAll() {
        return userDao.findUserAll();
    }


//    增加用户
    @Override
    public int addUser(User user) {

//        System.out.println(user.getName());
//        System.out.println(user.getPassword());


//加密密码
        Md5Utils md5Utils =new Md5Utils();
       user.setPassword(md5Utils.getPassWord(user.getPassword()));

        userDao.addUser(user);
        return 1;
    }


//根据用户密码查询
    @Override
    public User findUserByPassWord(User user) {

        Md5Utils md5Utils = new Md5Utils();
        User user1 =new User();
//      密码传值加密
        user.setPassword(md5Utils.getPassWord(user.getPassword()));

//        数据库里面的用户密码

        user1 =  userDao.findUserByPassWord(user);

          return user1;

    }




}
