package com.chongqing.service;

/**
 * @program: management
 * @author: 一树
 * @data: 2021/1/31 13:28
 */
public interface LoginService{
     Object login(String name,String password,String type) throws Exception;

     String registered(String username, String password,String type) throws Exception;
}
