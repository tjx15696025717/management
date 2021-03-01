package com.chongqing.controller;

import com.chongqing.domain.Activity;
import com.chongqing.domain.JoinActivity;
import com.chongqing.domain.MoreActivity;
import com.chongqing.service.ActivityService;
import com.chongqing.util.CrowdMessage;
import com.chongqing.util.entiy.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 小谭 on 2021/3/1.
 */
@RestController
@RequestMapping
@CrossOrigin
public class ActivityController {


    @Autowired
    private ActivityService activityService;

    /**
     * 活动管理
     */
    @RequestMapping(value = "/insert/activity")
    public ResultEntity<String> InsertActivity(@RequestBody Activity activity) throws Exception {
        Integer index = activityService.insertActivity(activity);
        String message = CrowdMessage.resultMessage(index, "insert");
        return ResultEntity.successWithMessage(message);
    }


    @RequestMapping(value = "/update/activity")
    public ResultEntity updateActivity(@RequestBody Activity activity) throws Exception {
        Integer index = activityService.updateActivity(activity);
        String message = CrowdMessage.resultMessage(index, "update");
        return ResultEntity.successWithMessage(message);
    }

    @RequestMapping(value = "/delete/activity")
    public ResultEntity deleteActivity(@RequestParam("ActivityId") Long activityId) throws Exception {
        Integer index = activityService.deleteActivity(activityId);
        String message = CrowdMessage.resultMessage(index, "delete");
        return ResultEntity.successWithMessage(message);
    }

    /**
     * 筛选查询
     * @param map
     * @return
     */
    @RequestMapping(value = "/select/Activity")
    public ResultEntity<List> selectActivity(@RequestBody(required = false)Map map) {
        try {
            List<Activity> managers = activityService.selectByActivityMap(map);
            return ResultEntity.successWithData(managers);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }

    }


    /**
     * 活动更多信息管理
     */

    /**
     * 加入活动
     * @param joinActivity
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/insert/activity_more")
    public ResultEntity<String> InsertJoinActivity(@RequestBody JoinActivity joinActivity) throws Exception {

        Integer index = activityService.insertJoinActivity(joinActivity);
        String message = CrowdMessage.resultMessage(index, "insert");
        return ResultEntity.successWithMessage(message);
    }

    /**
     * 更新信息包括 打分，签到
     * @param joinActivity
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/update/activity_more")
    public ResultEntity updateJoinActivity(@RequestBody JoinActivity joinActivity) throws Exception {
        Integer index = activityService.updateJoinActivity(joinActivity);
        String message = CrowdMessage.resultMessage(index, "update");
        return ResultEntity.successWithMessage(message);
    }

    /**
     * 取消活动
     * @param joinActivityId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/delete/activity_more")
    public ResultEntity deleteJoinActivity(@RequestParam("joinActivityActivityId") Long joinActivityId) throws Exception {
        Integer index = activityService.deleteJoinActivity(joinActivityId);
        String message = CrowdMessage.resultMessage(index, "delete");
        return ResultEntity.successWithMessage(message);
    }

    /**
     * 筛选查询
     * @param map
     * @return
     */
    @RequestMapping(value = "/select/activity_more")
    public ResultEntity<List> selectJoinActivity(@RequestBody(required = false)Map map) {
        try {
            List<MoreActivity> managers = activityService.selectByJoinActivityMap(map);
            return ResultEntity.successWithData(managers);
        }catch (Exception e){
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }

    }

}
