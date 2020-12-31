package com.lyqc.base.re.product;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 产品费用规则Re对象
 * @Date : 下午2:38 2017/12/27
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductFeeRuleRe implements Serializable {
    private static final long serialVersionUID = -8441324944915094748L;
    /**
     * 个人保障计划费用规则集合
     */
    private List<LifeInsuranceRe> lifeInsuranceList;
}
