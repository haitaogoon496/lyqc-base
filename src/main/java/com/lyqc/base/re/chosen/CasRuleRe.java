package com.lyqc.base.re.chosen;

import com.lyqc.base.re.product.GpsRuleRe;
import com.lyqc.base.re.product.LoanRateRuleRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 贷款申请单费用规则Re对象
 * 业务场景：适用于力蕴系统复审时获取相关费用项、利率等
 * 业务背景：该Re对象基于对 lyqc-cas的/common/getGpsFeeAndRate
 * @Date : 下午3:19 2018/3/22
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class CasRuleRe extends AppRuleRe {
    private static final long serialVersionUID = -2720160876967640372L;
    /**
     * 贷款利率
     */
    @ApiModelProperty(name="loanRateRuleRe",value="贷款利率",dataType="LoanRateRuleRe")
    private LoanRateRuleRe loanRateRuleRe;
    /**
     * GPS规则
     */
    @ApiModelProperty(name="gpsRule",value="GPS规则",dataType="GpsRuleRe")
    private GpsRuleRe gpsRule;

}
