package com.chongqing.dao;

import com.chongqing.domain.Management;

public interface ManagementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Management record);

    int insertSelective(Management record);

    Management selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Management record);

    int updateByPrimaryKey(Management record);
}