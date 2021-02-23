package com.zhaodf.controller;

import com.zhaodf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * 类：UserController
 *
 * @author zhaodf
 * @date 2021/2/20
 */
@Controller
public class UserController {
    UserService userService;

    @Autowired
    public UserController(@Qualifier("userServiceImpl")UserService userService) {
        this.userService = userService;
    }

    public void  getUser(){
        userService.getUser();
    }
}
