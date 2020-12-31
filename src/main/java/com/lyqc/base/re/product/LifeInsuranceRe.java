package com.lyqc.base.re.product;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: 个人保障计划费用规则Re对象
 * @Date : 下午2:40 2017/12/27
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
public class LifeInsuranceRe implements Serializable {
    private static final long serialVersionUID = 4073001773795187518L;
    /**
     * 费用规则名称
     */
    @ApiModelProperty(name="ruleName",value="费用规则名称",dataType="String")
    private String ruleName;
    /**
     * 利率（非百分数）
     */
    @ApiModelProperty(name="rateValue",value="利率（非百分数）",dataType="BigDecimal")
    private BigDecimal rateValue;

    public LifeInsuranceRe() {
    }

    public LifeInsuranceRe(String ruleName, BigDecimal rateValue) {
        this.ruleName = ruleName;
        this.rateValue = rateValue;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public BigDecimal getRateValue() {
        return rateValue;
    }

    public void setRateValue(BigDecimal rateValue) {
        this.rateValue = rateValue;
    }
}
