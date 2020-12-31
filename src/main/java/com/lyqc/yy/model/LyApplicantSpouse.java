package com.lyqc.yy.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyApplicantSpouse implements Serializable
{
    private static final long serialVersionUID = -3896560898985297532L;
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
    private String serialNo;

    /**
     *  默认为0
     *  电子授权传1，代表授权完备;
     *  纸质授权传0：代表授权未完备;
     *  未做授权传空
     */
    @ApiModelProperty(name="spousePbocCreditAuthorize",value="人行征信授权",dataType="String")
    private String spousePbocCreditAuthorize;

    /**
     * 默认为ZZ
     * DZ：电子授权
     * ZZ：纸质授权
     */
    @ApiModelProperty(name="spousePbocCreditAuthorizeType",value="授权方式",dataType="String")
    private String spousePbocCreditAuthorizeType;

}
