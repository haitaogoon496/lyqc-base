package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyCoreApplicantSpouse implements Serializable
{
    private static final long serialVersionUID = 5334802260781395686L;
    private Long id;
    private String appCode;
    private String relativesName;
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
    private String childrenNum;
    private Integer livingNum;
    private Date createTime;
    private String mobile;

}
