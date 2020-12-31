package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.CascadeValidation;
import com.lyqc.base.dto.calc.MonthlyPaymentTrialDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 用于计算合同费用项的DTO
 * @Date : 2018/12/12 上午11:12
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContractFeeItemDTO extends BaseDTO{
    @CascadeValidation(value = "SerLoanAfterMngRateDTO",message = "计算服务人贷后管理费率相关参数校验不通过")
    @ApiModelProperty(name="mngRateDTO",value="计算服务人贷后管理费率DTO",required = true,dataType="SerLoanAfterMngRateDTO")
    SerLoanAfterMngRateDTO mngRateDTO;

    @CascadeValidation(value = "MonthlyPaymentTrialDTO",message = "月供和总利息相关参数校验不通过")
    @ApiModelProperty(name="paymentTrialDTO",value="计算计算月供和总利息DTO",required = true,dataType="MonthlyPaymentTrialDTO")
    MonthlyPaymentTrialDTO paymentTrialDTO;
}
