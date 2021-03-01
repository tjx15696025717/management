package com.chongqing.domain;

import java.util.Date;

public class Record {
    private Long id;

    private String name;

    private Long pid;

    private Date recordTime;

    private String remark;

    private String status;

    private String temp;

    private String case1;

    private String case2;

    private String case3;

    private String case4;

    private String case5;

    private String info;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp == null ? null : temp.trim();
    }

    public String getCase1() {
        return case1;
    }

    public void setCase1(String case1) {
        this.case1 = case1 == null ? null : case1.trim();
    }

    public String getCase2() {
        return case2;
    }

    public void setCase2(String case2) {
        this.case2 = case2 == null ? null : case2.trim();
    }

    public String getCase3() {
        return case3;
    }

    public void setCase3(String case3) {
        this.case3 = case3 == null ? null : case3.trim();
    }

    public String getCase4() {
        return case4;
    }

    public void setCase4(String case4) {
        this.case4 = case4 == null ? null : case4.trim();
    }

    public String getCase5() {
        return case5;
    }

    public void setCase5(String case5) {
        this.case5 = case5 == null ? null : case5.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }
}