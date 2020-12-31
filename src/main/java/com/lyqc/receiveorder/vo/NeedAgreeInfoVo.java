package com.lyqc.receiveorder.vo;

import java.io.Serializable;
import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 订单特殊状态
 * 是否需要销售确认的
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeedAgreeInfoVo implements Serializable {
    /**
     * 是否是需要同意高风险
     */
    private boolean needAgreeHighRisk;

    /**
     * 是否是需要同意loanToValue 降额批复
     */
    private boolean needAgreeLtv;

    /**
     * 非ltv普通降额批复  只能同意，取消
     */
    private boolean needCommonReduceAgree;

    private Integer oldProductCode;
    private Integer newProductCode;

    private String oldProductName;
    private String newProductName;

    private BigDecimal oldMonthFee;
    private BigDecimal newMonthFee;

    private Integer oldLoanPeriods;
    private Integer newLoanPeriods;

    private BigDecimal oldComRate;
    private BigDecimal newComRate;

    private BigDecimal oldLoanRate;
    private BigDecimal newLoanRate;

    private BigDecimal oldCarLoanAmount;
    private BigDecimal newCarLoanAmount;
}
