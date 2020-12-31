package com.lyqc.base.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * @description: 订单费用信息
 * @Date : 2018/12/3 下午3:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CaAppInfoFeeEntity implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 订单id
     */
    private String appCode;

    /**
     * 续保押金id
     */
    private Integer renewalCommissionRuleId;

    /**
     * 续保押金名称
     */
    private String renewalCommissionName;

    /**
     * 申请续保押金
     */
    private BigDecimal applyRenewCommission;

    /**
     * 批复续保押金
     */
    private BigDecimal replyRenewCommission;

    /**
     * 基础平台费率
     */
    private BigDecimal basicPlatformRate;

    /**
     * 申请盗抢险id
     */
    private Integer applyTheftProtectionId;

    /**
     * 申请盗抢险金额
     */
    private BigDecimal applyTheftProtectionFee;

    /**
     * 申请盗抢险返佣
     */
    private BigDecimal applyTheftProtectionRebate;

    /**
     * 批复盗抢险id
     */
    private Integer replyTheftProtectionId;

    /**
     * 批复盗抢险金额
     */
    private BigDecimal replyTheftProtectionFee;

    /**
     * 批复盗抢险返佣
     */
    private BigDecimal replyTheftProtectionRebate;

    /**
     * 超融总金融
     */
    private BigDecimal overFinanceAmount;

    /**
     * 超享包id
     */
    private Long enjoyPackId;

    /**
     * 申请车享包金额
     */
    private BigDecimal applyEnjoyPackFee;

    /**
     * 批复车享包金额
     */
    private BigDecimal replyEnjoyPackFee;

    /**
     * 车享包返佣金额
     */
    private BigDecimal enjoyPackRebate;

    /**
     * 车享包包含项Code
     */
    private String enjoyPackItemsCode;

    /**
     * 车享包包含项Name
     */
    private String enjoyPackItemsName;
}