package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 押金对象
 * @Date : 2018/6/26 15:20
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
public class CommissionRe extends BaseRe{
    @ApiModelProperty(name = "renewalCommission", value = "续保押金", dataType = "BigDecimal")
    private BigDecimal renewalCommission = BigDecimal.ZERO;

    @ApiModelProperty(name = "renewalCommissionName", value = "续保押金名称", dataType = "String")
    private String renewalCommissionName;
}
