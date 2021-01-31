package com.chongqing.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Management {
    private Long id;

    private Long houseId;

    private String mobile;

    private String name;

    private String password;

    private String photo;

    private String qq;

    private String sex;

    private String info;

}