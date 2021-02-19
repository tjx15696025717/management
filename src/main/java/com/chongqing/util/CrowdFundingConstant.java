package com.chongqing.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 小谭 on 2021/1/31.
 */
public class CrowdFundingConstant {
    public static final String ATTR_NAME_MESSAGE = "MESSAGE";
    public static final String ATTR_NAME_LOGIN_ADMIN = "LOGIN-ADMIN";

    public static final String MESSAGE_LOGIN_FAILED = "登录账号或密码不正确！请核对后再登录！";
    public static final String MESSAGE_CODE_INVALID = "明文不是有效字符串，请核对后再操作！";
    public static final String IDENTUTY = "请选择登录的身份";
    public static final String MESSAGE_ACCESS_DENIED = "请登录后再操作";
    public static final String ATTR_NAME_PAGE_INFO="PAGE-INFO";
    public static final String MESSAGE_LOGIN_ACCT_ALREADY_IN_USE = "账号已被注册";

    public static final Map<String, String> EXCEPTION_MESSAGE_MAP = new HashMap<>();

    static {
        EXCEPTION_MESSAGE_MAP.put("java.lang.ArithmeticException", "系统在进行数学运算时发生错误");
        EXCEPTION_MESSAGE_MAP.put("java.lang.RuntimeException", "系统在运行时发生错误");
        EXCEPTION_MESSAGE_MAP.put("com.atguigu.crowd.funding.exception.LoginException", "登录过程中运行错误");
        EXCEPTION_MESSAGE_MAP.put("org.springframework.security.access.AccessDeniedException", "尊敬的用户，您现在不具备访问当前功能的权限！请联系超级管理员。");

    }
}