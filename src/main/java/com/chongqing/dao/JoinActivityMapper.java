package com.chongqing.dao;

import com.chongqing.domain.JoinActivity;
import com.chongqing.domain.JoinActivityExample;
import java.util.List;
import java.util.Map;

import com.chongqing.domain.MoreActivity;
import org.apache.ibatis.annotations.Param;

public interface JoinActivityMapper {
    int countByExample(JoinActivityExample example);

    int deleteByExample(JoinActivityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JoinActivity record);

    int insertSelective(JoinActivity record);

    List<JoinActivity> selectByExample(JoinActivityExample example);

    JoinActivity selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JoinActivity record, @Param("example") JoinActivityExample example);

    int updateByExample(@Param("record") JoinActivity record, @Param("example") JoinActivityExample example);

    int updateByPrimaryKeySelective(JoinActivity record);

    int updateByPrimaryKey(JoinActivity record);

    List<MoreActivity> selectByMap(Map map);
}