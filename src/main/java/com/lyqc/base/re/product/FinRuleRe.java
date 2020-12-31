package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 保险规则附加属性
 * @Date : 2018/3/13
 * @Author : 樊康康(kangkang.fan@mljr.com)
 */
@Data
public class FinRuleRe extends BaseRe{
    @ApiModelProperty(name="salePriceMin",value="车最小销售价格",dataType="String")
    public String salePriceMin;
    @ApiModelProperty(name="salePriceMax",value="车最大销售价格",dataType="String")
    public String salePriceMax;
    @ApiModelProperty(name="carloanAmountMin",value="车贷贷款最小金额",dataType="String")
    public String carloanAmountMin;
    @ApiModelProperty(name="carloanAmountMax",value="车贷贷款最大金额",dataType="String")
    public String carloanAmountMax;
    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    public String isOld;
    @ApiModelProperty(name="isHouse",value="是否需要房产",dataType="String")
    public String isHouse;
    @ApiModelProperty(name="isLcv",value="是否乘用车",dataType="String")
    public String isLcv;
    @ApiModelProperty(name="loanAmountMin",value="总贷款最小金额",dataType="String")
    public String loanAmountMin;
    @ApiModelProperty(name="loanAmountMax",value="总贷款最大金额",dataType="String")
    public String loanAmountMax;
    @ApiModelProperty(name="initScaleMin",value="最小首付比例",dataType="String")
    public String initScaleMin;
    @ApiModelProperty(name="initScaleMax",value="最大首付比例",dataType="String")
    public String initScaleMax;
    @ApiModelProperty(name="loanPeriods",value="申请还款期限",dataType="String")
    public String loanPeriods;
    @ApiModelProperty(name="carAgeMin",value="车最小年龄",dataType="String")
    public String carAgeMin;
    @ApiModelProperty(name="carAgeMax",value="车最大年龄",dataType="String")
    public String carAgeMax;
    @ApiModelProperty(name="courseMin",value="行驶最小公里数",dataType="String")
    public String courseMin;
    @ApiModelProperty(name="courseMax",value="行驶最大公里数",dataType="String")
    public String courseMax;
    @ApiModelProperty(name="commercialInsuranceExp",value="【商业险】费用计算公式",dataType="String")
    public String commercialInsuranceExp;
    @ApiModelProperty(name="trafficInsuranceExp",value="【交强险】费用计算公式",dataType="String")
    public String trafficInsuranceExp;
    @ApiModelProperty(name="purchaseTaxExp",value="【购置税】费用计算公式",dataType="String")
    public String purchaseTaxExp;
}
