package com.lyqc.poseidon.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class LTVResDTO implements Serializable{
    private static final long serialVersionUID = -2656997618488569479L;

    @ApiModelProperty(value = "订单号")
    private String appCode;

    @ApiModelProperty(value = "车辆贷款金额")
    private BigDecimal adjustAmount;

    @ApiModelProperty(value = "GPS档位")
    private String adjustGpsLevel;

    @ApiModelProperty(value = "平台费率")
    private BigDecimal adjustComFeeRate;

    @ApiModelProperty(value = "基础平台费率")
    private BigDecimal comFeeBasicRate;

    @ApiModelProperty(value = "贷款总金额")
    private BigDecimal loanAmount;

    @ApiModelProperty(value = "月供")
    private BigDecimal monthFee;

}
