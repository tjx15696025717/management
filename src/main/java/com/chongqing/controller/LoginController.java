package com.chongqing.controller;

import com.chongqing.service.LoginService;
import com.chongqing.util.CrowdFundingConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:27
 */
@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;


    public LoginController() {
        super();
    }

    @RequestMapping("/admin/do/login")
    public String doLogin(@RequestParam("loginAcct")String loginAcct,
                          @RequestParam("userPswd")String userPswd,
                          @RequestParam("type")String type,
                          Model model,
                          HttpSession session) {
        loginService.login(loginAcct,userPswd,type);

//        if(admin==null){
//            model.addAttribute(CrowdFundingConstant.ATTR_NAME_MESSAGE, CrowdFundingConstant.MESSAGE_LOGIN_FAILED);
//            return "admin-login";
//
//        }
//        session.setAttribute(CrowdFundingConstant.ATTR_NAME_LOGIN_ADMIN, admin);
        return "redirect:/admin/to/main/page.html";

    }
}
