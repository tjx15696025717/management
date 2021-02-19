package com.chongqing.dao;

import com.chongqing.domain.Management;
import org.apache.catalina.Manager;

import java.util.List;
import java.util.Map;

public interface ManagementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Management record);

    int insertSelective(Management record);

    Management selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Management record);

    int updateByPrimaryKey(Management record);

    Management selectByName(String name);

    List<Management> selectByMap(Map map);
}