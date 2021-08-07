package com.example.demo.service.Impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(UserModel userModel) {
        int i = userMapper.insertSelective(userModel);
        return i;
    }
}
