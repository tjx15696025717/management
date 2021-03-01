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
public class Activity {
    private Long id;

    private String activityName;

    private String createName;

    private Long createId;

    private Date activityTime;

    private String activityLong;

    private String activityWhere;

    private Integer allPerson;

    private Integer joinPerson;

    private String status;

    private String message;


}