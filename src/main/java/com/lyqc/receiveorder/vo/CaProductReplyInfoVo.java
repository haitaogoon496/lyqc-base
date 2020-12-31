package com.lyqc.receiveorder.vo;

import java.math.BigDecimal;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaProductReplyInfoVo {

    @ApiModelProperty(name = "车贷产品code")
    private Integer productCode;

    @ApiModelProperty(name = "车贷产品名称")
    private String productName;

    @ApiModelProperty(name = "批复车贷总额")
    private BigDecimal replyLoanAmount;

    @ApiModelProperty(name = "车辆售价")
    private BigDecimal salePrice;

    @ApiModelProperty(name = "批复车贷金额")
    private BigDecimal replyCarLoanAmount;

    @ApiModelProperty(name = "GPS档位")
    private String gpsLevel;
    @ApiModelProperty(name = "批复GPS返佣费")
    private BigDecimal replyGpsRebateFee;

    @ApiModelProperty(name = "批复利率档位")
    private String replyRateLevel;

    @ApiModelProperty(name = "批复平台费率")
    private BigDecimal replyComRate;
    @ApiModelProperty(name = "批复平台返佣费")
    private BigDecimal replySerFinRebateFee;


    @ApiModelProperty(name = "批复人身保险金额")
    private BigDecimal replyLifeInsurance;
    @ApiModelProperty(name = "人身保险规则名称")
    private String lifeInsuranceRule;
    @ApiModelProperty(name = "人身保险费率")
    private BigDecimal lifeInsuranceRate;

    @ApiModelProperty(name = "批复盗抢险id")
    private Integer replyTheftProtectionId;
    @ApiModelProperty(name = "批复盗抢险金额")
    private BigDecimal replyTheftProtectionFee;
    @ApiModelProperty(name = "批复盗抢险返佣金额")
    private BigDecimal replyTheftProtectionRebate;

    @ApiModelProperty(name = "批复续保押金金额")
    private BigDecimal replyRenewCommission;
    @ApiModelProperty(name = "批复续保押金ID")
    private Integer replyRenewCommissionId;

    @ApiModelProperty(name = "批复账户管理费用")
    private BigDecimal replyAccountFee;

    @ApiModelProperty(name = "批复车贷期数")
    private Integer replyLoanPeriods;

    @ApiModelProperty(name = "超享包id")
    private Long enjoyPackId;
    @ApiModelProperty(name = "申请车享包金额")
    private BigDecimal applyEnjoyPackFee;
    @ApiModelProperty(name = "批复车享包金额")
    private BigDecimal replyEnjoyPackFee;
    @ApiModelProperty(name = "车享包返佣金额")
    private BigDecimal enjoyPackRebate;
    @ApiModelProperty(name = "车享包包含项Code")
    private List<String> enjoyPackItemCodes;
    @ApiModelProperty(name = "车享包包含项Name")
    private List<String> enjoyPackItemNames;

}
