package com.lyqc.poseidon.dto;

import java.math.BigDecimal;

public class HistoricalRecordsDTO {

    /**
     * 旧 申请车辆贷款金额(LTV调整前)
     */
    private BigDecimal rCarLoanAmount;

    /**
     * 旧 车辆调整价
     */
    private BigDecimal aCarPriceChange;

    private int businessType;

    public BigDecimal getrCarLoanAmount() {
        return rCarLoanAmount;
    }

    public void setrCarLoanAmount(BigDecimal rCarLoanAmount) {
        this.rCarLoanAmount = rCarLoanAmount;
    }

    public BigDecimal getaCarPriceChange() {
        return aCarPriceChange;
    }

    public void setaCarPriceChange(BigDecimal aCarPriceChange) {
        this.aCarPriceChange = aCarPriceChange;
    }

    public int getBusinessType() {
        return businessType;
    }

    public void setBusinessType(int businessType) {
        this.businessType = businessType;
    }
}
