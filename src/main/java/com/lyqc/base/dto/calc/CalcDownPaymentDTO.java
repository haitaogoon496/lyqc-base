package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description 计算首付相关（首付比、首付款）DTO对象
 * 业务场景：用于单独调用
 * @Date : 2018/4/24 下午2:49
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CalcDownPaymentDTO extends BaseDTO{

    private static final long serialVersionUID = 2537375935099820364L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    @NotNull(message = "[appCode]appCode不能为空")
    private String appCode;

    @ApiModelProperty(name="productCode",value="产品code",dataType="Integer")
    @NotNull(message = "[productCode]产品code不能为空")
    private Integer productCode;

    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;

    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;
}
