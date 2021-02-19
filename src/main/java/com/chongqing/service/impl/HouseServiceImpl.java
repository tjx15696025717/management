package com.chongqing.service.impl;

import com.chongqing.dao.HouseMapper;
import com.chongqing.dao.ManagementMapper;
import com.chongqing.domain.House;
import com.chongqing.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseMapper;

    @Autowired
    private ManagementMapper managementMapper;

    @Override
    public String insertHouse(House house) {
        int res = this.houseMapper.insert(house);
        if (res>0){
            return "插入成功";
        }
        return "插入失败";
    }

    @Override
    public String UpdateHouse(House house) {
        int res = this.houseMapper.updateByPrimaryKeySelective(house);
        if (res >0){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public String deleteHouse(Long houseId) {
        int res = this.houseMapper.deleteByPrimaryKey(houseId);
        if (res >0){
            return "删除成功";
        }
        return "删除失败";
}

    @Override
    public List<House> selectByMap(Map map) {
        return this.houseMapper.selectByMap(map);
    }
}
