package com.chongqing.controller;


import com.chongqing.domain.PhysicalExamination;
import com.chongqing.domain.Record;
import com.chongqing.domain.User;
import com.chongqing.service.LoginService;
import com.chongqing.service.UserService;
import com.chongqing.util.entiy.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@RestController
@RequestMapping
public class UserManagerController {


    @Autowired
    private LoginService loginService;

    @Autowired
    private UserService userManagerService;

    /**
     * 用户基本信息管理功能
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update/user")
    public ResultEntity updateUser(@RequestBody User user) throws Exception {
        String meesage = userManagerService.UpdateUser(user);
        return new ResultEntity<String>(meesage,null,null);
    }

    @RequestMapping(value = "/delete/user")
    public ResultEntity deleteUser(@RequestParam("userId") Long userId) throws Exception {
        String meesage = userManagerService.deleteUser(userId);
        return new ResultEntity<String>("tree",meesage,null);
    }

    /**
     * 筛选查询
     * @param map
     * @return
     */
    @RequestMapping(value = "/select/user")
    public ResultEntity<List> selectUser(@RequestBody(required = false) Map map) {
        try {
            List<User> users = userManagerService.selectByMap(map);
            return ResultEntity.successWithData(users);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    /**
     * 打卡功能
     * startTime ,endTime 时间筛选条件
     *
     */
    @RequestMapping(value = "/select/Record")
    public ResultEntity<List> selectRecord(@RequestBody(required = false)Map map) {
        try {
            List<Record> records = userManagerService.selectRecordMap(map);
            return ResultEntity.successWithData(records);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping(value = "/update/Record")
    public ResultEntity<Integer> updateRecord(@RequestBody Record record) throws Exception {
        int index = userManagerService.UpdateRecord(record);
        return ResultEntity.successWithData(index);
    }

    @RequestMapping(value = "/insert/Record")
    public ResultEntity<String> InsertManager(@RequestBody Record record) throws Exception {
        String meesage = userManagerService.insertRecod(record);
        return ResultEntity.successWithMessage(meesage);
    }





    /**
     * 体检信息录入
     * startTime ,endTime 时间筛选条件
     *
     */
    @RequestMapping(value = "/select/Physical")
    public ResultEntity<List> selectPhysical(@RequestBody(required = false)Map map) {
        try {
            List<PhysicalExamination> records = userManagerService.selectPhysicalMap(map);
            return ResultEntity.successWithData(records);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping(value = "/update/Physical")
    public ResultEntity<Integer> updatePhysical(@RequestBody PhysicalExamination physicalExamination) throws Exception {
        int index = userManagerService.UpdatePhysical(physicalExamination);
        return ResultEntity.successWithData(index);
    }

    @RequestMapping(value = "/insert/Physical")
    public ResultEntity<Integer> InsertPhysical(@RequestBody PhysicalExamination physicalExamination) throws Exception {
        int index = userManagerService.insertPhysical(physicalExamination);
        return ResultEntity.successWithData(index);
    }

    @RequestMapping(value = "/delete/Physical")
    public ResultEntity<Integer> deletePhysical(@RequestParam(value = "id") Long id) throws Exception {
        int index = userManagerService.deletePhysical(id);
        return ResultEntity.successWithData(index);
    }



}
