package com.lyqc.product.dto.loanbefore;

import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description:  贷前更换资金方选择产品完毕后获取不依赖其它费用项的基础费用项规则
 * @Date : 2018/12/12 10:54
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
@NoArgsConstructor
public class RuleRecommendDTO extends BaseRecommentDTO{
    private static final long serialVersionUID = -7298570442447633955L;

    @ApiModelProperty(name="serFinRebateFee",value="批复平台返佣费",dataType="BigDecimal")
    @NotNull(message = "[serFinRebateFee]平台返佣费不能为空")
    private BigDecimal serFinRebateFee;
    @ApiModelProperty(name="gpsRebateFee",value="批复GPS返佣费",dataType="BigDecimal")
    @NotNull(message = "[gpsRebateFee]GPS返佣费不能为空")
    private BigDecimal gpsRebateFee;
    @ApiModelProperty(name="theftProtectionId",value="盗抢险ID",dataType="Integer")
    private Integer theftProtectionId;
    @ApiModelProperty(name="renewalCommissionRuleId",value="续保押金ID",dataType="Integer")
    private Integer renewalCommissionRuleId;
}
