package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.base.re.calc.MonthlyPaymentTrialRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @description: 用于计算合同费用项的Re
 * @Date : 2018/12/12 上午11:16
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContractFeeItemRe extends BaseRe {
    @ApiModelProperty(name="serLoanAfterMngRate",value="服务人贷后管理费率",required = true,dataType="BigDecimal")
    BigDecimal serLoanAfterMngRate;

    @ApiModelProperty(name="monthlyPaymentTrialRe",value="计算月供和总利息",required = true,dataType="MonthlyPaymentTrialRe")
    MonthlyPaymentTrialRe monthlyPaymentTrialRe;
}
