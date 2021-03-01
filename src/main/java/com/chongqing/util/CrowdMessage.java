package com.chongqing.util;

import reactor.core.Exceptions;

/**
 * Created by 小谭 on 2021/2/28.
 */
public class CrowdMessage {

    /**
     *
     * @param integer 数据库操作的返回值
     * @param message  用于描述具体是什么操作
     * @return  操作结果
     */
    public static String resultMessage(Integer integer,String message) {
        if (!CrowdFundingUtils.stringEffective(message)){
            return "参数异常";
        }
        if(integer>0){
            if(message.contains("insert")) return "插入成功";
            else if (message.contains("delete")) return "删除成功";
            else if (message.contains("update")) return "更新成功";
        }else{
            if(message.contains("insert")) return "插入失败";
            else if (message.contains("delete")) return "删除失败";
            else if (message.contains("update")) return "更新失败";
        }
        return "参数传递错误";
    }
}
