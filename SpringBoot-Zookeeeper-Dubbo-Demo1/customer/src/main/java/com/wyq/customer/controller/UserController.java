package com.wyq.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wyq.common.domin.User;
import com.wyq.common.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/**
 * @ClassName UserController
 * @Description: //TODO
 * @Author wyq
 * @Date 2022/4/1 20:24
 */
@RestController
public class UserController {
    @Resource
    @Reference(version = "1.0.0")
    private UserService userService;

    @GetMapping("getUser")
    public User user(){
        System.out.println("进来了！！！！！！！！！！！！！！！！");
        System.out.println(userService.hashCode()+"!!!!!!!!!!!!!!!!");
        return userService.findUser();
    }
}
