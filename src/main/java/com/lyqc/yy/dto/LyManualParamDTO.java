package com.lyqc.yy.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class LyManualParamDTO implements Serializable
{
    private static final long serialVersionUID = -8138159293403277070L;
    private String serialNo;
    private String appCode;
    private String idno;
    private String proppsername;
    private List<String> carNameList;
    private String carReceivedTime;
    private String carFinishedTime;
    private String carFinishedType;
    private List<String> cabNameList;
    private String cabReceivedTime;
    private String cabFinishedTime;
    private String cabFinishedType;
    private List<String> apprNameList;
    private String apprReceivedTime;
    private String apprFinishedTime;
    private String apprFinishedType;
    private String remarks;
    private String loanRemarks;
    private String fyRemarks;
    private String sysaRemarks;
    private BigDecimal aLoanAmount;
    private BigDecimal aCarloanAmount;
    private BigDecimal aInitPayment;
    private BigDecimal aInitScale;
    private Integer aLoanPeriods;
    private BigDecimal aLoanRate;
    private BigDecimal rLoanAmount;
    private BigDecimal rCarloanAmount;
    private BigDecimal rInitPayment;
    private BigDecimal rInitScale;
    private Integer rLoanPeriods;
    private BigDecimal rLoanRate;
    private String cancelType;
    private String cancelReason;
    private String status;
    private List<String> highRiskProductList;
    private String isOld;
    private String isLcv;
    private String dealerCompanyCode;
    private String dealerCompanyName;
    private String productName;
    /**
     * 微众一审客户分级
     */
    private String wzCustomGrade;
    /**
     * 微众一审输出的授信金额
     */
    private BigDecimal wzFirstCreditLimit;
    /**
     * 二手车调整价
     */
    private BigDecimal aCarPriceChange;

}
