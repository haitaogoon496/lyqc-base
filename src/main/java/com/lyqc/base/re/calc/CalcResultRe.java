package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import com.lyqc.base.re.product.EnjoyPackRuleRe;
import com.lyqc.base.re.product.TheftProtectionRe;
import com.lyqc.product.re.ExtendPropRe;
import com.lyqc.product.re.FeeRuleIdRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 申请单计算结果Re对象
 * @Date : 上午11:23 2018/4/8
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class CalcResultRe extends BaseRe {

    @ApiModelProperty(name="loanAmount",value="总贷款金额",dataType="BigDecimal")
    private BigDecimal loanAmount = BigDecimal.ZERO;

    @ApiModelProperty(name="overFinanceAmount",value="超融总金额",dataType="BigDecimal")
    private BigDecimal overFinanceAmount = BigDecimal.ZERO;

    @ApiModelProperty(name="loanRate",value="贷款利率",dataType="BigDecimal")
    private BigDecimal loanRate  = BigDecimal.ZERO;

    @ApiModelProperty(name="initScale",value="首付比",dataType="BigDecimal")
    private BigDecimal initScale = BigDecimal.ZERO;

    @ApiModelProperty(name="initPayment",value="首付款",dataType="BigDecimal")
    private BigDecimal initPayment = BigDecimal.ZERO;

    @ApiModelProperty(name="extendCost",value="延保费套餐金额",dataType="BigDecimal")
    private BigDecimal extendCost = BigDecimal.ZERO;

    @ApiModelProperty(name="extendName",value="延保费套餐名称",dataType="String")
    private String extendName;

    @ApiModelProperty(name="accountAmount",value="账号管理费",dataType="BigDecimal")
    private BigDecimal accountAmount = BigDecimal.ZERO;

    @ApiModelProperty(name="lifeInsurance",value="人身保险费金额",dataType="BigDecimal")
    private BigDecimal lifeInsurance = BigDecimal.ZERO;

    @ApiModelProperty(name="monthFee",value="月供",dataType="BigDecimal")
    private BigDecimal monthFee = BigDecimal.ZERO;

    @ApiModelProperty(name="secureFee",value="车辆保险费",dataType="BigDecimal")
    private BigDecimal secureFee = BigDecimal.ZERO;

    @ApiModelProperty(name="notarizationFee",value="公证费",dataType="BigDecimal")
    private BigDecimal notarizationFee = BigDecimal.ZERO;

    @ApiModelProperty(name="preInterestAmount",value="前置总利息",dataType="BigDecimal")
    private BigDecimal preInterestAmount = BigDecimal.ZERO;

    @ApiModelProperty(name="grossInterestAmount",value="总利息",dataType="BigDecimal")
    private BigDecimal grossInterestAmount = BigDecimal.ZERO;

    @ApiModelProperty(name="premiumFeeResultRe",value = "第二/三年保险费",dataType = "PremiumFeeResultRe")
    private PremiumFeeResultRe premiumFeeResultRe;

    @ApiModelProperty(name="commissionRe",value = "押金相关计算",dataType = "CommissionRe")
    private CommissionRe commissionRe;

    @ApiModelProperty(name="gpsCalcResultRe",value="gps相关计算",dataType="GpsCalcResultRe")
    private GpsCalcResultRe gpsCalcResultRe;

    @ApiModelProperty(name="carCalcResultRe",value="车辆相关计算",dataType="CarCalcResultRe")
    private CarCalcResultRe carCalcResultRe;

    @ApiModelProperty(name="comFeeCalcResultRe",value = "平台费相关计算",dataType = "ComFeeCalcResultRe")
    private ComFeeCalcResultRe comFeeCalcResultRe;

    @ApiModelProperty(name="feeRuleIdRe",value = "费率规则相关ID",dataType = "FeeRuleIdRe")
    private FeeRuleIdRe feeRuleIdRe;

    @ApiModelProperty(name="theftProtectionRe",value = "盗强险相关计算",dataType = "TheftProtectionRe")
    private TheftProtectionRe theftProtectionRe;

    @ApiModelProperty(name="enjoyPackRe",value = "超享包相关计算",dataType = "EnjoyPackRuleRe")
    private EnjoyPackRuleRe enjoyPackRuleRe;

    @ApiModelProperty(name="extendProps",value = "扩展属性集合",dataType = "List<ExtendPropRe>")
    private List<ExtendPropRe> extendProps;
}
