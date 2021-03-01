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
public class PhysicalExamination {
    private Long id;

    private Long pid;

    private String name;

    private String diastolicPressure;

    private String systolicPressure;

    private String bodyWeight;

    private String waistHip;

    private String urea;

    private String uricAcid;

    private String glycerolGlycol;

    private String cholesterol;

    private String glucose;

    private String protein;

    private String metrics;

    private Date recordTime;


}