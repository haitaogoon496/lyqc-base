package com.lyqc.yy.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyGuarantee implements Serializable
{
    private static final long serialVersionUID = 6728178809355360554L;
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
    private String serialNo;

    /**
     * 默认为0
     * 电子授权传1，代表授权完备
     * 纸质授权传0：代表授权未完备
     * 未做授权传空
     */
    @ApiModelProperty(name="guaranteePbocCreditAuthorize",value="人行征信授权",dataType="String")
    private String guaranteePbocCreditAuthorize;

    /**
     * 默认为ZZ
     * DZ：电子授权，ZZ：纸质授权
     */
    @ApiModelProperty(name="guaranteePbocCreditAuthorizeType",value="授权方式",dataType="String")
    private String guaranteePbocCreditAuthorizeType;


}
