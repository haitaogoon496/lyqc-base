package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 等额本息月供 计算DTO对象
 * @Date : 下午8:02 2018/4/18
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class MonthlyPaymentDTO extends BaseDTO {
    @ApiModelProperty(name="productCode",value="产品编码",dataType="Integer")
    @NotNull(message = "[productCode]产品编码不能为空")
    private Integer productCode;

    @ApiModelProperty(name="loanAmount",value="总贷款金额",dataType="BigDecimal")
    @NotNull(message = "[loanAmount]总贷款金额不能为空")
    private BigDecimal loanAmount;

    @ApiModelProperty(name="periods",value="还款期限",dataType="BigDecimal")
    @NotNull(message = "[periods]账号管理费不能为空")
    private BigDecimal periods;

    @ApiModelProperty(name="yearRate",value="贷款利率",dataType="BigDecimal")
    @NotNull(message = "[yearRate]贷款利率不能为空")
    private BigDecimal yearRate;
}
