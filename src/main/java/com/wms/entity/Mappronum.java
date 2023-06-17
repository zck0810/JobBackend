package com.wms.entity;


import lombok.Data;

@Data
public class Mappronum {
    private int id;
    private String province;
    private double avgsalarymin;
    private double avgsalarymax;
    private double avgsalary;
    private int num;
}
