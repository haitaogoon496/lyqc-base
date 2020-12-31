package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 等额本息月供 和 总利息 计算Re对象
 * @Date : 下午8:06 2018/4/18
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class MonthlyPaymentTrialRe extends BaseRe {
    @ApiModelProperty(name="monthFee",value="月供金额",dataType="BigDecimal")
    private BigDecimal monthFee;

    @ApiModelProperty(name="grossInterest",value="总利息",dataType="BigDecimal")
    private BigDecimal grossInterest;
}
