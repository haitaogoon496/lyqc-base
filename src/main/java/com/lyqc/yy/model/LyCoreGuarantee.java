package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyCoreGuarantee implements Serializable
{
    private static final long serialVersionUID = -6224918860199669476L;
    private Long id;
    private String appCode;
    private String guaranteeName;
    private String idno;
    private String idType;
    private String birth;
    private String sex;
    private String marriage;
    private String education;
    private String province;
    private String city;
    private String address;
    private String nowProvince;
    private String nowCity;
    private String nowAddress;
    private String nowTel;
    private Integer nowLivingTime;
    private Date firstWorkTime;
    private String nowIndustry;
    private String nowPosition;
    private String incomeSource;
    private Double incomeMonth;
    private Double incomeOth;
    private String nowCompany;
    private String nowUnitKind;
    private String nowUnitProvince;
    private String nowUnitCity;
    private String nowUnitAddress;
    private Integer nowUnitScale;
    private String nowUnitTel;
    private String mobile;
    private String email;
    private String wBirth;
    private String wIdType;
    private String wIdno;
    private String wGuaranteeName;
    private String wMobile;
    private String wSex;
    private Date createTime;

}
