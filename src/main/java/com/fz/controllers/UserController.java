package com.fz.controllers;

import com.fz.entity.User;
import com.fz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 *
 * 控制层
 * */

@Controller
public class UserController {




    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    //    查询所有

    @ResponseBody
    @RequestMapping( "findUserAll")
    public List<User> findUserAll(){

        return userService.findUserAll();
    }

//    根据用户密码查询

    @ResponseBody
    @RequestMapping("findUserByPassWord")
    public String  findUserByPassWord(User user)  {

        System.out.println( "userPassword:"+ user.getPassword());

//        数据库里面的用户密码
            User user1 =new User();
            try {
             user1 =  userService.findUserByPassWord(user);
                System.out.println("user1Password:"+user1.getPassword());


        if (user.equals(user)){//判断是否由用户存在
            return "login";
        }
            }catch (Exception e){
                System.out.println(e);
            }

          return "error";

    }

//增加用户
    @ResponseBody
    @RequestMapping(value = "addUser",method= RequestMethod.POST)
    public int  addUser(User user) {

         userService.addUser(user);
         return 1;
    }

}
