package com.chongqing.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class MoreActivity {
    private Long id;

    private Long activityId;

    private Long userId;

    private Date signTime;

    private String userName;

    private Integer score;

    private String actityName;

    private  Activity activity;

}
