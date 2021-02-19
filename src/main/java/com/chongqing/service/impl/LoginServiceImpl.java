package com.chongqing.service.impl;

import com.chongqing.dao.AdminMapper;
import com.chongqing.dao.ManagementMapper;
import com.chongqing.dao.UserMapper;
import com.chongqing.domain.Admin;
import com.chongqing.domain.Management;
import com.chongqing.domain.User;
import com.chongqing.service.LoginService;
import com.chongqing.util.CrowdFundingConstant;
import com.chongqing.util.CrowdFundingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:29
 */
@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ManagementMapper managementMapper;


    /**
     * 登录功能
     *
     * @param name
     * @param password
     * @param type     登录类型，0,user,1,admin,2,manager
     * @return
     */
    @Override
    public Object login(String name, String password, String type) throws Exception {
        // TODO Auto-generated method stub
        //根据type查询数据库,判断哪种类型的登录
        if (null == type) return null;
        else if (type.equals("0")) {
            User user = userMapper.selectByName();
            if (user == null) {
                return CrowdFundingConstant.MESSAGE_LOGIN_FAILED;
            }
            String usrPswdBroswer = CrowdFundingUtils.md5(password);
            if (user.getPassword().equals(usrPswdBroswer)) {
                return user;
            }


        } else if (type.equals("1")) {
            Admin admin = adminMapper.selectByName(name);
            if (null == admin) {
                return CrowdFundingConstant.MESSAGE_LOGIN_FAILED;
            }

            String usrPswdBroswer = CrowdFundingUtils.md5(password);
            if (admin.getPassword().equals(usrPswdBroswer)) {
                return admin;
            }

        } else if (type.equals("2")) {
            Management management = managementMapper.selectByName(name);
            if (management == null) {
                return CrowdFundingConstant.MESSAGE_LOGIN_FAILED;
            }
            String usrPswdBroswer = CrowdFundingUtils.md5(password);
            if (management.getPassword().equals(usrPswdBroswer)) {
                return management;
            }

        }
        return CrowdFundingConstant.IDENTUTY;
    }

    @Override
    public String registered(String username, String password, String type) throws Exception {
        if (null == username || null == password) return "请输入账号或密码";
        else if (type.equals("0")) {
            User user = userMapper.selectByName();
            if (user != null) {
                return CrowdFundingConstant.MESSAGE_LOGIN_ACCT_ALREADY_IN_USE;
            }
            String password1 = CrowdFundingUtils.md5(password);
            User user1 = new User();
            user1.setName(username);
            user1.setPassword(password1);
            int index = userMapper.insert(user);
            if (index < 1) return "注册失败";
            return "注册成功";

        } else if (type.equals("1")) {
            Admin admin = adminMapper.selectByName(username);
            if (admin != null) {
                return CrowdFundingConstant.MESSAGE_LOGIN_ACCT_ALREADY_IN_USE;
            }
            String password1 = CrowdFundingUtils.md5(password);
            Admin admin1 = new Admin();
            admin1.setName(username);
            admin1.setPassword(password1);
            int index = adminMapper.insert(admin1);
            if (index < 1) return "注册失败";
            return "注册成功";

        } else if (type.equals("2")) {
            Management management = managementMapper.selectByName(username);
            if (management!= null) {
                return CrowdFundingConstant.MESSAGE_LOGIN_ACCT_ALREADY_IN_USE;
            }
            String password1 = CrowdFundingUtils.md5(password);
            Management management1 = new Management();
            management1.setName(username);
            management1.setPassword(password1);
            int index = managementMapper.insert(management1);
            if (index < 1) return "注册失败";
            return "注册成功";

        }
        return "账号有误";
    }


}
