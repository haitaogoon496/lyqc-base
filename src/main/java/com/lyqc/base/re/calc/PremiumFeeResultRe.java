package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 保险费（第二年、第三年）Re对象
 * @Date : 上午11:58 2018/4/18
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class PremiumFeeResultRe extends BaseRe {
    @ApiModelProperty(name="secondYearPremiumFee",value="第二年保险费套餐金额",dataType="BigDecimal")
    private BigDecimal secondYearPremiumFee = BigDecimal.ZERO;

    @ApiModelProperty(name="secondYearPremiumTcName",value="第二年保险费套餐名称",dataType="String")
    private String secondYearPremiumTcName;

    @ApiModelProperty(name="thirdYearPremiumFee",value="第三年保险费套餐金额",dataType="BigDecimal")
    private BigDecimal thirdYearPremiumFee = BigDecimal.ZERO;

    @ApiModelProperty(name="thirdYearPremiumTcName",value="第三年保险费套餐名称",dataType="String")
    private String thirdYearPremiumTcName;
}
