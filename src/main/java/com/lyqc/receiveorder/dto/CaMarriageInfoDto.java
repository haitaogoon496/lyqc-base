package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**配偶信息
 * @author huyue
 * @date 2018/10/10 15:14
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaMarriageInfoDto implements Serializable {

    private Integer marriageId;
    private String idType;
    private String idno;
    private String marriageName;
    private String psw;
    private String birth;
    private String sex;
    private String marriage;
    private String education;
    private String province;
    private String district;
    private String city;
    private String address;
    private String nowProvince;
    private String nowCity;
    private String nowDistrict;
    private String nowAddress;
    private String nowPostalcode;
    private String nowTel;
    private Byte nowLivingTime;
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
    private Short nowUnitScale;
    private String nowUnitTel;
    private String nowUnitPostalcode;
    private String isDriverLicense;
    private String firstDriverNo;
    private String mobile;
    private String email;
    private String status;
    private String remakes;
    private String wIdType;
    private String wIdno;
    private String wGuaranteeName;
    private String wBirth;
    private String wSex;
    private String wMobile;
    private Date updateTime;
    private String court;
    private String companyType;
    private BigDecimal registerCapital;
    private Date establishmentDate;
    private Integer operPeriod;
    private String businessLicense;
    private String creditCode;
    private String companyProvince;
    private String companyCity;
    private String companyAddress;
    private String legalName;
    private String legalTel;
    private String legalIdno;
    private String companyName;
    private String authType;

}
