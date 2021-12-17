package com.fz.controllers;

import com.fz.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class TestController {



   @ResponseBody
   @RequestMapping("test")
    public String test(){
       System.out.println("test,进来了");
       return "test.ok";
   }


}
