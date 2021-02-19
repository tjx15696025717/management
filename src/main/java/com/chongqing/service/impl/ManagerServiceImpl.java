package com.chongqing.service.impl;

import com.chongqing.dao.HouseMapper;
import com.chongqing.dao.ManagementMapper;
import com.chongqing.domain.Management;
import com.chongqing.service.ManagerService;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@Service
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private HouseMapper houseMapper;

    @Autowired
    private ManagementMapper managementMapper;

    @Override
    public String insertManager(Management manager) {
        int res = this.managementMapper.insert(manager);
        if (res>0){
            return "插入成功";
        }
        return "插入失败";
    }

    @Override
    public String UpdateManager(Management manager) {
        int res = this.managementMapper.updateByPrimaryKeySelective(manager);
        if (res >0){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public String deleteManager(Long managerId) {
        int res = this.managementMapper.deleteByPrimaryKey(managerId);
        if (res >0){
            return "删除成功";
        }
        return "删除失败";
    }

    @Override
    public List<Management> selectByMap(Map map) {
        return this.managementMapper.selectByMap(map);
    }
}
