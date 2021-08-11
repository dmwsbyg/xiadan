package com.example.demo.service.Impl;

import com.example.demo.dao.OrderMapper;
import com.example.demo.service.OrderService;
import com.example.demo.service.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int orderFrom(OrderModel orderModel) {
        int i = orderMapper.insertSelective(orderModel);
        return i;
    }
}
