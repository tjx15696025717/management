package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private Long userId;

    private Long houseId;

    private String mobile;

    private String password;

    private String photo;

    private String sex;

    private String qq;

}