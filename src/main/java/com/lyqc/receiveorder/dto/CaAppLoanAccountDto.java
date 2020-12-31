package com.lyqc.receiveorder.dto;


import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 放款账号信息
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppLoanAccountDto implements Serializable {
    /**
     * 开户姓名
     **/
    private String recAccountName;
    /**
     * 开户支行
     **/
    private String recAccountBank2;
    /**
     * 开户行
     **/
    private String recAccountBank;
    /**
     * 经销商收款账号
     **/
    private String recAccountNo;
    /**
     * 账户类型
     */
    private String loanType;

    private String accountType;
    private String bankCity;
    private String bankProvince;
    private String branchBankCode;
    private String recordMobile;
    private String recAccountCard;

}