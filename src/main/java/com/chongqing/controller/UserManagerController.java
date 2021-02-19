package com.chongqing.controller;


import com.chongqing.domain.User;
import com.chongqing.service.LoginService;
import com.chongqing.service.UserManagerService;
import com.chongqing.util.CrowdFundingConstant;
import com.chongqing.util.entiy.ResultEntity;
import com.chongqing.util.entiy.TableData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
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
    private UserManagerService userManagerService;

    @RequestMapping(value = "/update/user")
    public ResultEntity InsertUser(@RequestBody User user) throws Exception {
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
    public ResultEntity<List> selectUser(@RequestParam(value = "map",required = false)Map map) {
        try {
            HashMap<Object, Object> maps = new HashMap<>();
            List<User> users = userManagerService.selectByMap(maps);
            return ResultEntity.successWithData(users);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }

    }



}
