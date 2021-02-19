package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class House {
    /**
    * 主键
    */
    private Long id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 楼栋号
    */
    private String num;

    /**
    * 备注
    */
    private String info;
}