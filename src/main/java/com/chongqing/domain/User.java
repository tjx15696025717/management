package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    /**
    * 主键
    */
    private Long userId;

    /**
    * 楼栋id
    */
    private Long houseId;

    /**
    * 电话
    */
    private String mobile;

    /**
    * 密码
    */
    private String password;

    /**
    * 照片
    */
    private String photo;

    /**
    * 性别
    */
    private Object sex;

    /**
    * qq
    */
    private String qq;
}