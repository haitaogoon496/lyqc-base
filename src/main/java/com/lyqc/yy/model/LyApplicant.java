
package com.lyqc.yy.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LyApplicant implements Serializable
{
    private static final long serialVersionUID = -771065472060694434L;
    private Long id;
    private String appCode;
    private String proppserName;
    private String idno;
    private String idCardExpiry;
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
    private String pbocCreditAuthorize;

    /**
     * DZ：电子授权，ZZ：纸质授权  传最新一次秒拒时的授权方式
     */
    @ApiModelProperty(name="pbocCreditAuthorizeType",value="授权方式",dataType="String")
    @NotNull(message = "授权方式不能为空")
    private String pbocCreditAuthorizeType;
    private String driverName;
    private String serialNo;

    /**
     *  ZY：直营，QD：渠道
     */
    @ApiModelProperty(name="channel",value="渠道",dataType="String")
    @NotNull(message = "渠道不能为空")
    private String channel;

    @ApiModelProperty(name="nation",value="民族",dataType="String")
    private String nation;
    @ApiModelProperty(name="customerType",value="客户类型",dataType="String")
    private String customerType;
}
