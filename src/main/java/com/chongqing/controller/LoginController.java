package com.chongqing.controller;

import com.chongqing.service.LoginService;
import com.chongqing.util.CrowdFundingConstant;
import com.chongqing.util.entiy.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:27
 */
@RestController
@RequestMapping
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/doLogin")
    public ResultEntity<Object> doLogin(@RequestParam(value = "username", required = true) String username,
                          @RequestParam(value = "password", required = true) String password,
                          @RequestParam(value = "type", required = true) String type,
                          HttpSession session) throws Exception {
        Object object = loginService.login(username, password, type);
        session.setAttribute(CrowdFundingConstant.ATTR_NAME_LOGIN_ADMIN, object);
        return ResultEntity.successWithData(object);
    }

    /**
     *
     * @param username
     * @param password
     * @param type 0 代表user, 1代表admin 2,代表 mangement
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/registered")
    public ResultEntity<String> doLogin(@RequestParam(value = "username", required = true) String username,
                                @RequestParam(value = "password", required = true) String password,
                                @RequestParam(value = "type", required = true) String type) throws Exception {
        String message = loginService.registered(username, password, type);
        if (message.equals("注册成功"))
            return ResultEntity.successWithoutData();
        else
            return ResultEntity.failed(message);
    }

    @RequestMapping("/admin/logout")
    public String logout(HttpSession session) {

        session.invalidate();
        return "redirect:/index.html";
    }

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
