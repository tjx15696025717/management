package com.chongqing.controller;

import com.chongqing.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:27
 */
@Controller
@RequestMapping
public class LoginController {


    private LoginService loginService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public String doLogin(HttpServletRequest request,
                          @RequestParam(value = "username", required = true) String username,
                          @RequestParam(value = "password", required = true) String password) {

        return loginService.login(username, password, null);
    }

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
