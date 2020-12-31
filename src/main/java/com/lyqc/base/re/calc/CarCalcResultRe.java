package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 车辆计算相关结果Re对象
 * @Date : 上午11:41 2018/4/8
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class CarCalcResultRe extends BaseRe {
    @ApiModelProperty(name="businessInsurance",value="商业险",dataType="BigDecimal")
    private BigDecimal businessInsurance = BigDecimal.ZERO;

    @ApiModelProperty(name="trafficInsurance",value="交强险",dataType="BigDecimal")
    private BigDecimal trafficInsurance = BigDecimal.ZERO;

    @ApiModelProperty(name="taxPrice",value="购置税",dataType="BigDecimal")
    private BigDecimal taxPrice = BigDecimal.ZERO;

    @ApiModelProperty(name="secureFee",value="车辆保险费",dataType="BigDecimal")
    private BigDecimal secureFee = BigDecimal.ZERO;

    /**
     * 下列对应CaAppInfo中 discountE(规则贴息金额)，disaRate(贴息后利率)，discountTrueE(实际贴息金额)
     */
    @ApiModelProperty(name="discountFee",value="规则贴息金额",dataType="BigDecimal")
    private BigDecimal discountFee;//规则贴息金额

    @ApiModelProperty(name="discountRate",value="贴息后利率",dataType="BigDecimal")
    private BigDecimal discountRate;//贴息后利率

    @ApiModelProperty(name="discountFeeReal",value="实际贴息金额",dataType="BigDecimal")
    private BigDecimal discountFeeReal;//实际贴息金额

    @ApiModelProperty(name="isDiscount",value="是否贴息",dataType="Integer")
    private Integer isDiscount;// 是否贴息
}
