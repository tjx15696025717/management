package com.chongqing.controller;


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
    public ResultEntity<List> selectUser(@RequestParam(value = "map",required = false)Map map) {
        try {
            List<User> users = userManagerService.selectByMap(map);
            return ResultEntity.successWithData(users);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }

    }



}
