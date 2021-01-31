package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Admin {
    private Long id;

    private String name;

    private String password;

    /**
    * 管理权限：0，所有权限 1，楼栋权限，2，待定
    */
    private Object status;
}