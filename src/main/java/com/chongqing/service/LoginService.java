package com.chongqing.service;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:28
 */
public interface LoginService<T>{
     T login(String name,String password,String type);
}
