package com.fz.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class Md5Utils {
//    盐值常量（二次加密）
    public static final String SOLT="nb666";


//    获取密码
    public String  getPassWord(String string){
//        MD5加密
       String passWord =  DigestUtils.md5Hex(string);
//第二次加密
       String passWord2 = DigestUtils.md5Hex(passWord+SOLT);

       return passWord2;
    }

}
