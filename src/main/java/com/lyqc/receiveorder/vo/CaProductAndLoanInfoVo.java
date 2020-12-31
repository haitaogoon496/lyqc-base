package com.lyqc.receiveorder.vo;

import java.math.BigDecimal;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaProductAndLoanInfoVo {
    @ApiModelProperty(name = "车贷产品code")
    private Integer productCode;

    @ApiModelProperty(name = "车贷产品名称")
    private String productName;

    @ApiModelProperty(name = "申请车贷总额")
    private BigDecimal applyLoanAmount;
    @ApiModelProperty(name = "批复车贷总额")
    private BigDecimal replyLoanAmount;

    @ApiModelProperty(name = "申请车贷期数")
    private Integer applyLoanPeriods;
    @ApiModelProperty(name = "批复车贷期数")
    private Integer replyLoanPeriods;

    @ApiModelProperty(name = "申请车贷金额")
    private BigDecimal applyCarLoanAmount;
    @ApiModelProperty(name = "批复车贷金额")
    private BigDecimal replyCarLoanAmount;

    @ApiModelProperty(name = "车辆售价")
    private BigDecimal salePrice;

    @ApiModelProperty(name = "申请GPS费用")
    private BigDecimal applyGpsFee;
    @ApiModelProperty(name = "批复GPS费用")
    private BigDecimal replyGpsFee;
    @ApiModelProperty(name = "GPS档位")
    private String gpsLevel;
    @ApiModelProperty(name = "批复GPS返佣费")
    private BigDecimal replyGpsRebateFee;

    @ApiModelProperty(name = "申请保险金额")
    private BigDecimal applySecureFee;
    @ApiModelProperty(name = "批复保险金额")
    private BigDecimal replySecureFee;

    @ApiModelProperty(name = "申请首付金额")
    private BigDecimal applyInitPayment;
    @ApiModelProperty(name = "批复首付金额")
    private BigDecimal replyInitPayment;
    @ApiModelProperty(name = "申请首付比例")
    private BigDecimal applyInitScale;
    @ApiModelProperty(name = "批复首付比例")
    private BigDecimal replyInitScale;

    @ApiModelProperty(name = "申请利率档位")
    private String applyRateLevel;
    @ApiModelProperty(name = "批复利率档位")
    private String replyRateLevel;

    @ApiModelProperty(name = "申请贷款利率")
    private BigDecimal applyLoanRate;
    @ApiModelProperty(name = "批复贷款利率")
    private BigDecimal replyLoanRate;

//    @ApiModelProperty(name = "平台费档位")
//    private String ComRateLevel;

    @ApiModelProperty(name = "申请平台费率")
    private BigDecimal applyComRate;
    @ApiModelProperty(name = "批复平台费率")
    private BigDecimal replyComRate;
    @ApiModelProperty(name = "批复基础平台费率")
    private BigDecimal replyBasicPlatformRate;
    @ApiModelProperty(name = "平台费返佣费率")
    private BigDecimal serFinRebateRate;

    @ApiModelProperty(name = "申请平台费")
    private BigDecimal applyComFee;
    @ApiModelProperty(name = "批复平台费")
    private BigDecimal replyComFee;
    @ApiModelProperty(name = "批复平台返佣费")
    private BigDecimal replySerFinRebateFee;

    @ApiModelProperty(name = "申请第二年保险套餐id")
    private Integer applyYanbaoTc;
    @ApiModelProperty(name = "申请第二年保险套餐名称")
    private String applyYanbaoTcName;
    @ApiModelProperty(name = "申请第二年保险套餐费用")
    private BigDecimal applyYanbaoFee;
    @ApiModelProperty(name = "批复第二年保险套餐费用")
    private BigDecimal replyYanbaoFee;

    @ApiModelProperty(name = "申请第三年保险套餐id")
    private Integer applyYanbaoTc3;
    @ApiModelProperty(name = "申请第三年保险套餐名称")
    private String applyYanbaoTc3Name;
    @ApiModelProperty(name = "申请第三年保险套餐费用")
    private BigDecimal applyYanbaoFee3;
    @ApiModelProperty(name = "批复第三年保险套餐费用")
    private BigDecimal replyYanbaoFee3;

    @ApiModelProperty(name = "申请账户管理费用")
    private BigDecimal applyAccountFee;
    @ApiModelProperty(name = "批复账户管理费用")
    private BigDecimal replyAccountFee;

    @ApiModelProperty(name = "批复前置利息")
    private BigDecimal replyGrossInterest;

    @ApiModelProperty(name = "申请人身保险金额")
    private BigDecimal applyLifeInsurance;
    @ApiModelProperty(name = "批复人身保险金额")
    private BigDecimal replyLifeInsurance;

    @ApiModelProperty(name = "人身保险规则名称")
    private String lifeInsuranceRule;

    @ApiModelProperty(name = "人身保险费率")
    private BigDecimal lifeInsuranceRate;

    @ApiModelProperty(name = "延保套餐id")
    private String extendId;
    @ApiModelProperty(name = "延保套餐名称")
    private String extendName;
    @ApiModelProperty(name = "延保套餐费用")
    private BigDecimal extendCost;
    @ApiModelProperty(name = "批复延保套餐费用")
    private BigDecimal ReplyExtendCost;

    @ApiModelProperty(name = "申请续保押金金额")
    private BigDecimal applyRenewCommission;
    @ApiModelProperty(name = "批复续保押金金额")
    private BigDecimal replyRenewCommission;
    @ApiModelProperty(name = "批复续保押金ID")
    private Integer replyRenewCommissionId;

    @ApiModelProperty(name = "申请月供")
    private BigDecimal applyMonthFee;
    @ApiModelProperty(name = "批复月供")
    private BigDecimal replyMonthFee;


    @ApiModelProperty(name = "申请盗抢险id")
    private Integer applyTheftProtectionId;
    @ApiModelProperty(name = "批复盗抢险id")
    private Integer replyTheftProtectionId;

    @ApiModelProperty(name = "申请盗抢险金额")
    private BigDecimal applyTheftProtectionFee;
    @ApiModelProperty(name = "批复盗抢险金额")
    private BigDecimal replyTheftProtectionFee;

    @ApiModelProperty(name = "申请盗抢险返佣")
    private BigDecimal applyTheftProtectionRebate;
    @ApiModelProperty(name = "批复申请盗抢险金额")
    private BigDecimal replyTheftProtectionRebate;
    @ApiModelProperty(name = "超融总金额")
    private BigDecimal overFinanceAmount;
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
