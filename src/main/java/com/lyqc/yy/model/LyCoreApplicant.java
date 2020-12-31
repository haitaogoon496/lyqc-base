package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LyCoreApplicant implements Serializable
{
    private static final long serialVersionUID = 3495224585838219100L;
    private Long id;
    private String appCode;
    private String proppserName;
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
    private String houseOwner;
    private Date firstWorkTime;
    private String nowIndustry;
    private String nowPosition;
    private String incomeSource;
    private BigDecimal incomeMonth;
    private BigDecimal incomeOth;
    private String nowCompany;
    private String nowUnitKind;
    private String nowUnitProvince;
    private String nowUnitCity;
    private String nowUnitAddress;
    private Integer nowUnitScale;
    private String nowUnitTel;
    private String isDriverLicense;
    private String firstDriverNo;
    private String relationDFl;
    private String driverNo;
    private String isAssure;
    private String mobile;
    private String mobiles;
    private String relationEContact;
    private String eContactMobile;
    private String eContact;
    private String relationEContacts;
    private String eContactsMobile;
    private String eContacts;
    private String creditRecords;
    private Date createTime;
    private String vehicle;
    private String creditcardType;
    private String creditcardBank;
    private String creditcardNo;
    private String loanRemarks;

}
