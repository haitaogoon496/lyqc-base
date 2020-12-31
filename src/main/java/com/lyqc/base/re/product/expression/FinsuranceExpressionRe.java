package com.lyqc.base.re.product.expression;

import lombok.Data;

/**
 * @description:【保险类规则】表达式
 * @Date : 2018/4/12 下午9:35
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class FinsuranceExpressionRe extends BaseExpressionRe{
    /**
     * 【交强险】费用计算公式
     */
    public String trafficInsuranceExp;
    /**
     * 【购置税】费用计算公式
     */
    public String purchaseTaxExp;

}