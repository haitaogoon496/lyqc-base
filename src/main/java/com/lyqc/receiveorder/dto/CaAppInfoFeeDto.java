package com.lyqc.receiveorder.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.math.BigDecimal;

/**订单费用
 * @author huyue
 * @date 2018/9/27 17:19
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppInfoFeeDto implements Serializable {

    /**
     * 申请总贷款金额(元)
     */
    private BigDecimal aLoanAmount;

    /**
     * 申请分期数
     */
    private Integer aLoanPeriods;

    /**
     * 申请的借款利率
     */
    private BigDecimal aLoanRate;

    /**
     * 批复续保押金 replyRenewCommission
     */
    private BigDecimal rRenewCommission;

    /**
     * 批复人身保险费
     */
    private BigDecimal rLifeInsurance;

    /**
     * 批复手续费
     */
    private BigDecimal rComFee;

    /**
     * 批复申请贷款年利率(%)
     */
    private BigDecimal rLoanRate;

    /**
     * 批复gps费用
     */
    private BigDecimal rGpsFee;
    /**
     * 批复购置税实际金额
     */
    private BigDecimal rTaxPrice;

    /**
     * RACarloanAmount（R_CARLOAN_AMOUNT）	批复车辆贷款金额
     */
    private BigDecimal rCarloanAmount;

    /**
     * 批复账户管理费
     */
    private BigDecimal rAccountFee;

    /**
     * 批复申请还款期限(月)
     */
    private Integer rLoanPeriods;

    /**
     * 批复实际贴息金额 150727
     */
    private BigDecimal rDiscountTrueE;

    /**
     * 批复贴息前利率,贴息产品保存贴息前利率preLoanRate
     */
    private BigDecimal rPreLoanRate;

    /**
     * 批复保险贷款金额
     */
    private BigDecimal rSecureFee;

    /**
     * 批复第二年保险费
     */
    private BigDecimal rYanbaoFee;

    /**
     * 批复第三年保险费
     */
    private BigDecimal rYanbaoFee3;

    /**
     * 批复总利息
     */
    private BigDecimal rGrossInterest;

    /**
     * 批复申请总贷款金额(元)
     */
    private BigDecimal rLoanAmount;

    /**
     * 批复申请首付款
     */
    private BigDecimal rInitPayment;

    /**
     * GPS返佣
     */
    private BigDecimal gpsRebate;

    /**
     * 平台返佣金额
     */
    private BigDecimal serFinRebate;

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
    @ApiModelProperty(name = "资方成本利率")
    private BigDecimal costRate;

}
