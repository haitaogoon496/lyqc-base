package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import com.lyqc.base.re.product.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @author lingyu.shang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"id"})
public class RuleRecommendRe extends BaseRe {

    @ApiModelProperty(name="loanRateRuleRe",value="利率费用规则")
    private RuleCommendRe<LoanRateRuleRe> loanRateRuleRe;

    @ApiModelProperty(name="serFinRuleRe",value="平台费费用规则")
    private RuleCommendRe<SerFinRuleRe> serFinRuleRe;

    @ApiModelProperty(name="gpsRuleRe",value="gps费用规则")
    private RuleCommendRe<GpsRuleRe> gpsRuleRe;

    @ApiModelProperty(name="lifeInsuranceRe",value="人身险费用规则")
    private RuleCommendRe<LifeInsuranceRe> lifeInsuranceRe;

    @ApiModelProperty(name="renewalCommissionRuleRe",value="续保押金费用规则")
    private RuleCommendRe<RenewalCommissionRuleRe> renewalCommissionRuleRe;

    @ApiModelProperty(name="theftProtectionRe",value="盗抢险费用规则")
    private RuleCommendRe<TheftProtectionRe> theftProtectionRe;
}
