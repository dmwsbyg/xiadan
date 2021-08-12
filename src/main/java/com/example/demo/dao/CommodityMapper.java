package com.example.demo.dao;

import com.example.demo.DataObject.Commodity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommodityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spxx
     *
     * @mbg.generated Sun Aug 08 22:26:26 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spxx
     *
     * @mbg.generated Sun Aug 08 22:26:26 GMT+08:00 2021
     */
    int insert(Commodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spxx
     *
     * @mbg.generated Sun Aug 08 22:26:26 GMT+08:00 2021
     */
    int insertSelective(Commodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spxx
     *
     * @mbg.generated Sun Aug 08 22:26:26 GMT+08:00 2021
     */
    Commodity selectByPrimaryKey(Integer id);

    List<Commodity> select();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spxx
     *
     * @mbg.generated Sun Aug 08 22:26:26 GMT+08:00 2021
     */
    int updateByPrimaryKeySelective(Commodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table spxx
     *
     * @mbg.generated Sun Aug 08 22:26:26 GMT+08:00 2021
     */
    int updateByPrimaryKey(Commodity record);

    int increaseInSales(@Param("id")Integer id, @Param("amount")Integer amount);

    int reduceStock(@Param("id")Integer id, @Param("amount")Integer amount);
}