package com.example.demo.service;

import com.example.demo.DataObject.User;
import com.example.demo.service.model.UserModel;
import org.springframework.stereotype.Service;


public interface UserService {

    int register(UserModel userModel);
}
