package com.chongqing.dao;

import com.chongqing.domain.Management;
import com.chongqing.domain.ManagementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ManagementMapper {
    int countByExample(ManagementExample example);

    int deleteByExample(ManagementExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Management record);

    int insertSelective(Management record);

    List<Management> selectByExample(ManagementExample example);

    Management selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Management record, @Param("example") ManagementExample example);

    int updateByExample(@Param("record") Management record, @Param("example") ManagementExample example);

    int updateByPrimaryKeySelective(Management record);

    int updateByPrimaryKey(Management record);
}