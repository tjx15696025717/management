package com.chongqing.service;

import com.chongqing.domain.Admin;
import com.chongqing.domain.Management;
import com.chongqing.domain.User;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:28
 */
public interface LoginService {
    String login(String name,String password,String type);
}
