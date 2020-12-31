package com.lyqc.product.re;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 产品费用项重置Re对象
 * @see  com.lyqc.product.dto.FeeResetDTO
 * @Date : 2018/10/29 下午2:49
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FeeResetRe implements Serializable {
    private static final Long serialVersionUID = 5640709010384094218L;
    @ApiModelProperty(name="resetRateLevel",value="利率档位",dataType="boolean")
    private boolean resetRateLevel;
    @ApiModelProperty(name="resetGpsLevel",value="gps档位",dataType="boolean")
    private boolean resetGpsLevel;
    @ApiModelProperty(name="comRate",value="平台费",dataType="boolean")
    private boolean resetComRate;
    @ApiModelProperty(name="secondYearPremium",value="第二年保险费",dataType="boolean")
    private boolean resetSecondYearPremium;
    @ApiModelProperty(name="thirdYearPremium",value="第三年保险费",dataType="boolean")
    private boolean resetThirdYearPremium;
    @ApiModelProperty(name="resetAccountFee",value="账户管理费",dataType="boolean")
    private boolean resetAccountFee;
    @ApiModelProperty(name="resetRenewalCommission",value="续保押金",dataType="boolean")
    private boolean resetRenewalCommission;
    @ApiModelProperty(name="lifeInsurance",value="人身保险费",dataType="boolean")
    private boolean resetLifeInsurance;
    @ApiModelProperty(name="resetTheftProtection",value="盗抢险",dataType="boolean")
    private boolean resetTheftProtection;
    @ApiModelProperty(name="resetEnjoyPack",value="超享包",dataType="boolean")
    private boolean resetEnjoyPack;
}
