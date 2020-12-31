package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author huyue
 * @date 2018/10/26 14:38
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyDealerCompanyDto implements Serializable {

    private Integer companyCode;

    private String companyName;

    private String companyType;

    private String rateArea;

    private String province;

    private String city;

    private String saleArea;

    private String address;

    private String brandType;

    private String brandName;

    private String dealerEmail;
    private String contactPerson;

    private String accountName;

    private String tel;

    private String appNo;

    private String isVip;

    private Date onlineTime;

    private Date updateTime;

    private String status;

    private String remarks;

    private String accountIdno;

    private String accountBank;

    private String accountSubBank;

    private String bankProvince;

    private String bankCity;

    private String accountNo;

    private Date offlineTime;

    private BigDecimal marginAmount;
}
