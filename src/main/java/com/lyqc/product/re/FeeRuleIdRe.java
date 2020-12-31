package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 产品相关费率规则IDRe对象
 * @Date : 2018/5/28 下午5:54
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class FeeRuleIdRe extends BaseRe {
    private static final long serialVersionUID = -7102059589085625620L;
    @ApiModelProperty(name="serFinRuleId",value="平台费规则ID",dataType="Integer")
    private Integer serFinRuleId;
    @ApiModelProperty(name="gpsRuleId",value="GPS费规则ID",dataType="Integer")
    private Integer gpsRuleId;
    @ApiModelProperty(name="loanRateRuleId",value="利率规则ID",dataType="Integer")
    private Integer loanRateRuleId;
    @ApiModelProperty(name="accountRuleId",value="账户管理费规则ID",dataType="Integer")
    private Integer accountRuleId;
    @ApiModelProperty(name="extendSafeRuleId",value="延保费规则ID",dataType="Integer")
    private Integer extendSafeRuleId;
    @ApiModelProperty(name="lifeInsuranceRuleId",value="人身保险费规则ID",dataType="Integer")
    private Integer lifeInsuranceRuleId;
    @ApiModelProperty(name="secondYearPremiumRuleId",value="第二年保险费规则ID",dataType="Integer")
    private Integer secondYearPremiumRuleId;
    @ApiModelProperty(name="thirdYearPremiumRuleId",value="第三年费规则ID",dataType="Integer")
    private Integer thirdYearPremiumRuleId;
    @ApiModelProperty(name="carSecureRuleId",value="车辆保险规则ID",dataType="Integer")
    private Integer carSecureRuleId;
    @ApiModelProperty(name="discountRuleId",value="贴息规则ID",dataType="Integer")
    private Integer discountRuleId;
    @ApiModelProperty(name="enjoyPackRuleId",value = "超享包规则id",dataType = "Integer")
    private Integer enjoyPackRuleId;
    @ApiModelProperty(name = "theftProtectionRuleId",value = "盗抢险规则id",dataType = "Integer")
    private Integer theftProtectionRuleId;
}
