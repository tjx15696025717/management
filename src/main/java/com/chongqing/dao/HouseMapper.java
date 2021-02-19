package com.chongqing.dao;

import com.chongqing.domain.House;

import java.util.List;
import java.util.Map;

public interface HouseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(House record);

    int insertSelective(House record);

    House selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    List<House> selectByMap(Map map);
}