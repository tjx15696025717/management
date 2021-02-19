package com.chongqing.controller;

import com.chongqing.domain.Management;
import com.chongqing.service.ManagerService;

import com.chongqing.util.entiy.ResultEntity;

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
public class ManagementController {

    @Autowired
    private ManagerService ManagerService;

    @RequestMapping(value = "/insert/Manager")
    public ResultEntity<String> InsertManager(@RequestBody Management manager) throws Exception {
        String meesage = ManagerService.insertManager(manager);
        return ResultEntity.successWithMessage(meesage);
    }


    @RequestMapping(value = "/update/Manager")
    public ResultEntity updateManager(@RequestBody Management manager) throws Exception {
        String meesage = ManagerService.UpdateManager(manager);
        return ResultEntity.successWithMessage(meesage);
    }

    @RequestMapping(value = "/delete/Manager")
    public ResultEntity deleteManager(@RequestParam("managerId") Long managerId) throws Exception {
        String meesage = ManagerService.deleteManager(managerId);
        return ResultEntity.successWithMessage(meesage);
    }

    /**
     * 筛选查询
     * @param map
     * @return
     */
    @RequestMapping(value = "/select/Manager")
    public ResultEntity<List> selectManager(@RequestParam(value = "map",required = false)Map map) {
        try {
            List<Management> managers = ManagerService.selectByMap(map);
            return ResultEntity.successWithData(managers);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }

    }
}
