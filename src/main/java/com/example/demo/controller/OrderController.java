package com.example.demo.controller;

import com.example.demo.DataObject.Commodity;
import com.example.demo.service.CommodityService;
import com.example.demo.service.OrderService;
import com.example.demo.service.model.OrderModel;
import com.example.demo.service.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private HttpServletRequest httpServletRequest;

    @Autowired
    private OrderService orderService;

    @Autowired
    private CommodityService commodityService;


    @ResponseBody
    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public String  orderFrom(@RequestParam(name = "commodityId")Integer commodityId,
                            @RequestParam(name = "amount")Integer amount) throws Exception {
        Boolean login = (Boolean)httpServletRequest.getSession().getAttribute("IS_LOGIN");
        System.out.println(login);

        if (login == null || !login.booleanValue()){
            return "用户未登入";
        }
        UserModel userModel = (UserModel)httpServletRequest.getSession().getAttribute("LOGIN_USER");

        System.out.println(userModel.getId());
        System.out.println(userModel.getName());
        commodityService.increaseInSales(commodityId,amount);
        commodityService.reduceStock(commodityId,amount);
        Commodity commodity = commodityService.itemById(commodityId);

        int userId = userModel.getId();
        OrderModel orderModel = new OrderModel();
        orderModel.setUserId(userId);
        orderModel.setCommodityId(commodityId);
        orderModel.setCommodityPrice(commodity.getPrice());
        orderModel.setAmount(amount);
        orderModel.setTotalPrice(amount*commodity.getPrice());
        int i = orderService.orderFrom(orderModel);
        if (i>0){
            return "下单成功";
        }else {
            return "下单未成功";
        }
    }


}
