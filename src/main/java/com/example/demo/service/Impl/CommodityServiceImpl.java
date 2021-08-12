package com.example.demo.service.Impl;

import com.example.demo.DataObject.Commodity;
import com.example.demo.dao.CommodityMapper;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityMapper commodityMapper;

    @Override
    public List<Commodity> item() {
        List<Commodity> item = commodityMapper.select();
        return item;
    }

    @Override
    public Commodity itemById(Integer id) {
        Commodity commodity = commodityMapper.selectByPrimaryKey(id);
        return commodity;
    }

    @Override
    public void increaseInSales(Integer commodityId, Integer amount) {
        commodityMapper.increaseInSales(commodityId, amount);
    }

    @Override
    public void reduceStock(Integer commodityId, Integer amount) {
        commodityMapper.reduceStock(commodityId,amount);
    }
}
