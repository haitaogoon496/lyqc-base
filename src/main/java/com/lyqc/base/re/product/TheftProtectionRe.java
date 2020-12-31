package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 盗抢险规则返回对象
 * @Date : 2018/11/5 15:24
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
public class TheftProtectionRe extends BaseRe{

    public TheftProtectionRe(){

    }

    public TheftProtectionRe(Integer id,String theftProtectionName,BigDecimal theftProtectionFee, BigDecimal theftProtectionRebate){
        this.setId(id);
        this.theftProtectionName = theftProtectionName;
        this.theftProtectionFee = theftProtectionFee;
        this.theftProtectionRebate = theftProtectionRebate;
    }

    /**
     * 盗抢险名称
     */
    @ApiModelProperty(name="theftProtectionName",value="盗抢险名称",dataType="String")
    private String theftProtectionName;

    @ApiModelProperty(name="theftProtectionFee",value="盗抢险金额",dataType="BigDecimal")
    private BigDecimal theftProtectionFee;

    @ApiModelProperty(name="theftProtectionRebate",value="盗抢险返佣费",dataType="BigDecimal")
    private BigDecimal theftProtectionRebate;
}
