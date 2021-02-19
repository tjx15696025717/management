package com.chongqing.service.impl;

import com.chongqing.dao.UserMapper;
import com.chongqing.domain.User;
import com.chongqing.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/2/19.
 */
@Service
public class UserManagerSeviceImpl implements UserManagerService {

    @Autowired
    private UserMapper userMapper;

    /***
     * 更新user 信息
     * @param user
     * @return
     */
    @Override
    public String UpdateUser(User user) {
        int res = this.userMapper.updateByPrimaryKeySelective(user);
        if (res >=0){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public String deleteUser(Long userId) {
        int res = this.userMapper.deleteByPrimaryKey(userId);
        if (res >=0){
            return "注销成功";
        }
        return "注销失败";
    }

    @Override
    public List<User> selectByMap(Map map) {
        if (null == map || map.isEmpty()){
            return null;
        }
        return this.userMapper.selectSelective(map);
    }
}
