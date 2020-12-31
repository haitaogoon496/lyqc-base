package com.lyqc.receiveorder.vo;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 用于批量查询返回
 * 因此这个实体尽量不要太大
 * 新的查询可以自己创建实体，不要复用这个
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppInfoBatVo extends CaAppInfoBaseVo {
    /**
     * 贷后状态
     */
    private String postLoanStatus;

    /**
     * 状态
     */
    private String status;

    /**
     * 申请总贷金额
     */
    private BigDecimal applyLoanAmount;

    /**
     * 批复总贷金额
     */
    private BigDecimal replyLoanAmount;
}
