package com.lyqc.poseidon.param;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CaAppInfoFee implements Serializable {
    private static final long serialVersionUID = 6015079550331957905L;

    private Integer id;

    private String appCode;

    private Integer renewalCommissionRuleId;

    private String renewalCommissionName;

    private BigDecimal applyRenewCommission;

    private BigDecimal replyRenewCommission;

    private BigDecimal basicPlatformRate;

    private Integer applyTheftProtectionId;

    private BigDecimal applyTheftProtectionFee;

    private BigDecimal applyTheftProtectionRebate;

    private Integer replyTheftProtectionId;

    private BigDecimal replyTheftProtectionFee;

    private BigDecimal replyTheftProtectionRebate;
}
