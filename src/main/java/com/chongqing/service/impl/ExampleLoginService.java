package com.chongqing.service.impl;

import com.chongqing.dao.AdminMapper;
import com.chongqing.domain.Admin;
import com.chongqing.service.LoginService;
import com.chongqing.util.CrowdFundingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 20:48
 */
@Service
public class ExampleLoginService implements LoginService {

    private AdminMapper adminMapper;


    @Autowired
    public ExampleLoginService(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    @Override
    public String login(String name, String password, String type) {

        try {
            Admin admin = adminMapper.selectByName(name);
            if (admin == null) {
                return "用户名不存在";
            }

            String pwd = CrowdFundingUtils.md5(password);
            if (!pwd.equals(admin.getPassword())) {
                return "密码错误";
            }

            return "登陆成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "登陆异常";
        }
    }
}
