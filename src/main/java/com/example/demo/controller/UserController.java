package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public int register(@RequestParam(name = "name")String name,
                           @RequestParam(name = "age")Integer age,
                           @RequestParam(name = "telephone")String telephone,
                           @RequestParam(name = "password")String password){
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setAge(age);
        userModel.setTelephone(telephone);
        userModel.setPassword(password);
        int i = userService.register(userModel);
        if (i>0){
            System.out.println("注册成功");
        }
        return i;
    }
}
