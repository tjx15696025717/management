package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Management {
    /**
    * 楼栋管理员主键
    */
    private Long managerId;

    /**
    * 楼栋id
    */
    private Long houseId;

    /**
    * 电话
    */
    private String mobile;

    /**
    * 姓名
    */
    private String name;

    /**
    * 密码
    */
    private String password;

    /**
    * 电话
    */
    private String photo;

    /**
    * qq
    */
    private String qq;

    /**
    * 性别
    */
    private Object sex;

    /**
    * 备注
    */
    private String info;
}