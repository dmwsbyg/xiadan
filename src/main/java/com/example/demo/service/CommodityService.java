package com.example.demo.service;

import com.example.demo.DataObject.Commodity;

import java.util.List;

public interface CommodityService {

    List<Commodity> item();

    Commodity itemById(Integer id);

    void increaseInSales(Integer commodityId,Integer amount);

    void reduceStock(Integer commodityId,Integer amount);
}
