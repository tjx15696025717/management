package com.chongqing.service;

import com.chongqing.domain.Activity;
import com.chongqing.domain.JoinActivity;
import com.chongqing.domain.MoreActivity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/3/1.
 */

public interface ActivityService {
    Integer insertActivity(Activity activity);

    Integer updateActivity(Activity activity);

    Integer deleteActivity(Long activityId);

    List<Activity> selectByActivityMap(Map map);

    Integer insertJoinActivity(JoinActivity joinActivity);

    Integer updateJoinActivity(JoinActivity joinActivity);

    Integer deleteJoinActivity(Long joinActivityId);

    List<MoreActivity> selectByJoinActivityMap(Map map);
}
