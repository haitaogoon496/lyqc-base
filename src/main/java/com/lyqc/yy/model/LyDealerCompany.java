package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyDealerCompany implements Serializable
{
    private static final long serialVersionUID = 7290461513410565895L;
    private Long id;
    private String appCode;
    private String companyName;
    private String dealerCompanyCode;
    private String province;
    private String city;
    private String saleArea;
    private String contactPerson;
    private String tel;
    private String isVip;
    private Date onlineTime;
    private Integer flowSeq;
    private Date createTime;
    private String dealerType;
    private String serialNo;

}
