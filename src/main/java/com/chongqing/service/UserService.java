package com.chongqing.service;

import com.chongqing.domain.User;
import org.apache.catalina.Manager;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
public interface UserService {

    String UpdateUser(User user);

    String deleteUser(Long userId);

    List<User> selectByMap(Map map);
}
