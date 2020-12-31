package com.lyqc.poseidon.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class LTVParam implements Serializable {
    private static final long serialVersionUID = 6287163647799679491L;

    @ApiModelProperty(value = "订单号")
    private String appCode;

    @ApiModelProperty(value = "车辆贷款金额")
    private BigDecimal adjustAmount;

    @ApiModelProperty(value = "GPS档位")
    private String adjustGpsLevel;

    @ApiModelProperty(value = "手续费率")
    private BigDecimal adjustComFeeRate;

   // @NotNull(message = "盗抢险费用必须填写")
    private BigDecimal adjustTheftProtectionFee;

    // @NotNull(message = "盗抢险费用必须填写")
    private Integer adjustTheftProtectionId;
}
