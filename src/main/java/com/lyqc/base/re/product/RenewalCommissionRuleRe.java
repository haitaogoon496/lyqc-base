package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 续保押金规则
 * @Date : 2018/6/25 14:26
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
public class RenewalCommissionRuleRe extends BaseRe{

    private static final long serialVersionUID = -8668826880370998118L;

    /**
     * 费用规则名称
     */
    @ApiModelProperty(name="renewalCommissionName",value="费用规则名称",dataType="String")
    private String renewalCommissionName;
    /**
     * 续保押金费用
     */
    @ApiModelProperty(name="renewalCommission",value="续保押金费用",dataType="BigDecimal")
    private BigDecimal renewalCommission;

    public RenewalCommissionRuleRe(Integer id, String renewalCommissionName, BigDecimal renewalCommission){
        this.setId(id);
        this.renewalCommissionName = renewalCommissionName;
        this.renewalCommission = renewalCommission;
    }
    public RenewalCommissionRuleRe(){

    }
}
