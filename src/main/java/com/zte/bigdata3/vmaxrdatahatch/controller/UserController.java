/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: UserController
 * Author:   Administrator
 * Date:     2017/11/17 0017 17:10
 * Description: user controller
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.zte.bigdata3.vmaxrdatahatch.controller;

import com.zte.bigdata3.vmaxrdatahatch.pojo.User;
import com.zte.bigdata3.vmaxrdatahatch.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈user controller〉
 *
 * @author Administrator
 * @create 2017/11/17 0017
 * @since 1.0.0
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //注入Service
    @Autowired
    private IUserService userService;

    @RequestMapping("regist")
    public String regist(User user, Model model){

        System.out.println("用户注册："+user.getUsername()+user.getPassword());
        userService.regist(user);
        model.addAttribute("msg", "注册成功");
        //注册成功后跳转success.jsp页面
        return "success";
    }

    @RequestMapping("login")
    public String login(String username,String password,Model model){

        System.out.println("用户登录："+username+password);

        userService.login(username,password);

        model.addAttribute("msg", "登录成功");

        return "success";
    }

}
