package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long userId;

    private Long houseId;

    private String mobile;

    private String password;

    private String photo;

    private String sex;

    private String qq;

}