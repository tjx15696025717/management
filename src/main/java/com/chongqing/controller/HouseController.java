package com.chongqing.controller;

import com.chongqing.domain.House;
import com.chongqing.service.HouseService;
import com.chongqing.service.ManagerService;
import com.chongqing.util.entiy.ResultEntity;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@RestController
@RequestMapping
public class HouseController {

    @Autowired
    private ManagerService managerService;

    @Autowired
    private HouseService houseService;



    @RequestMapping(value = "/insert/house")
    public ResultEntity<String> InsertHouse(@RequestBody House house) throws Exception {
        String meesage = houseService.insertHouse(house);
        return ResultEntity.successWithMessage(meesage);
    }



    @RequestMapping(value = "/update/house")
    public ResultEntity<String> updateHouse(@RequestBody House house) throws Exception {
        String meesage = houseService.UpdateHouse(house);
        return ResultEntity.successWithMessage(meesage);
    }

    @RequestMapping(value = "/delete/house")
    public ResultEntity<String> deleteHouse(@RequestParam("houseId") Long houseId) throws Exception {
        String meesage = houseService.deleteHouse(houseId);
        return ResultEntity.successWithMessage(meesage);
    }

    /**
     * 筛选查询
     * @param map
     * @return
     */
    @RequestMapping(value = "/select/house")
    public ResultEntity<List> selectUser(@RequestBody(required = false)Map map) {
        try {
            List<House> houses = houseService.selectByMap(map);
            return ResultEntity.successWithData(houses);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }
}
