package com.chongqing.service.impl;

import com.chongqing.dao.ActivityMapper;
import com.chongqing.dao.JoinActivityMapper;
import com.chongqing.domain.Activity;
import com.chongqing.domain.JoinActivity;
import com.chongqing.domain.MoreActivity;
import com.chongqing.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/3/1.
 */
@Service
@Transactional
public class ActivityServiceImpl  implements ActivityService {

    @Autowired
    private ActivityMapper activityMapper;

    @Autowired
    private JoinActivityMapper joinActivityMapper;

    @Override
    public Integer insertActivity(Activity activity) {
        return this.activityMapper.insert(activity);
    }

    @Override
    public Integer updateActivity(Activity activity) {
        return this.activityMapper.updateByPrimaryKeySelective(activity);
    }

    @Override
    public Integer deleteActivity(Long activityId) {
        return this.activityMapper.deleteByPrimaryKey(activityId);
    }

    @Override
    public List<Activity> selectByActivityMap(Map map) {
        return this.activityMapper.selectByActivityMap(map);
    }

    @Override
    public Integer insertJoinActivity(JoinActivity joinActivity) {
        //新建more_activity的数据
        int index = this.joinActivityMapper.insert(joinActivity);

        Long activityId = joinActivity.getActivityId();
        // 更新activity 数据
        Activity activity = this.activityMapper.selectByPrimaryKey(activityId);

        activity.setJoinPerson(activity.getJoinPerson()+1);

        return this.activityMapper.updateByPrimaryKeySelective(activity);

    }

    @Override
    public Integer updateJoinActivity(JoinActivity joinActivity) {
        return this.joinActivityMapper.updateByPrimaryKeySelective(joinActivity);
    }

    @Override
    public Integer deleteJoinActivity(Long joinActivityId) {
        JoinActivity joinActivity = this.joinActivityMapper.selectByPrimaryKey(joinActivityId);
        Long activityId = joinActivity.getActivityId();
        this.joinActivityMapper.deleteByPrimaryKey(joinActivityId);

        //更新 activity
        Activity activity = this.activityMapper.selectByPrimaryKey(activityId);
        activity.setJoinPerson(activity.getJoinPerson()-1);
        return this.activityMapper.updateByPrimaryKeySelective(activity);

    }

    @Override
    public List<MoreActivity> selectByJoinActivityMap(Map map) {
        return this.joinActivityMapper.selectByMap(map);
    }
}
