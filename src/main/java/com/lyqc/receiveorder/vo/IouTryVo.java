package com.lyqc.receiveorder.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IouTryVo implements Serializable {
    private String appCode;
    private String name;//借款人姓名
    private String idno;//借款人身份证号
    private String bankAccount;//还款银行卡号
    private String mobile;//联系手机号
    private BigDecimal monthlyPayment;//月供
    private BigDecimal loanAmount;//总贷款金额
    private BigDecimal carLoanAmount;//个人汽车贷款金额
    private BigDecimal creditLoanAmount;//个人信用消费贷款金额
    private BigDecimal gpsFee;//GPS费用
    private BigDecimal platformFee;//平台管理费
    private BigDecimal insuranceFee;//保险费
    private BigDecimal purchaseTax;//购置税
    private BigDecimal interestRate;//利率
    private Integer periods;//贷款期数
}
