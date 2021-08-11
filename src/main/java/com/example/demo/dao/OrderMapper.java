package com.example.demo.dao;

import com.example.demo.DataObject.Order;
import com.example.demo.service.model.OrderModel;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddxx
     *
     * @mbg.generated Tue Aug 10 23:38:55 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddxx
     *
     * @mbg.generated Tue Aug 10 23:38:55 GMT+08:00 2021
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddxx
     *
     * @mbg.generated Tue Aug 10 23:38:55 GMT+08:00 2021
     * @param record
     */
    int insertSelective(OrderModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddxx
     *
     * @mbg.generated Tue Aug 10 23:38:55 GMT+08:00 2021
     */
    Order selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddxx
     *
     * @mbg.generated Tue Aug 10 23:38:55 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ddxx
     *
     * @mbg.generated Tue Aug 10 23:38:55 GMT+08:00 2021
     */
    int updateByPrimaryKey(Order record);
}