package com.example.demo.controller;


import com.example.demo.DataObject.Commodity;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/item",method = RequestMethod.GET)
    @ResponseBody
    public List<Commodity> item(){
        List<Commodity> item = commodityService.item();
        return item;
    }
}
