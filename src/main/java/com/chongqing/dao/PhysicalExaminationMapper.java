package com.chongqing.dao;

import com.chongqing.domain.PhysicalExamination;
import com.chongqing.domain.PhysicalExaminationExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface PhysicalExaminationMapper {

    int countByExample(PhysicalExaminationExample example);

    int deleteByExample(PhysicalExaminationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PhysicalExamination record);

    int insertSelective(PhysicalExamination record);

    List<PhysicalExamination> selectByExample(PhysicalExaminationExample example);

    PhysicalExamination selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PhysicalExamination record, @Param("example") PhysicalExaminationExample example);

    int updateByExample(@Param("record") PhysicalExamination record, @Param("example") PhysicalExaminationExample example);

    int updateByPrimaryKeySelective(PhysicalExamination record);

    int updateByPrimaryKey(PhysicalExamination record);

    List<PhysicalExamination> selectByMap(Map map);
}