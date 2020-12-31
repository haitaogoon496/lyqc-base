package com.lyqc.receiveorder.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

/**
 * 费用信息
 * @author huyue
 * @date 2018/11/19 11:13
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppInfoFeeBatVo {

    @ApiModelProperty(name = "申请盗抢险金额")
    private BigDecimal applyTheftProtectionFee;
    @ApiModelProperty(name = "批复盗抢险金额")
    private BigDecimal replyTheftProtectionFee;

    @ApiModelProperty(name = "申请盗抢险返佣")
    private BigDecimal applyTheftProtectionRebate;
    @ApiModelProperty(name = "批复盗抢险返佣")
    private BigDecimal replyTheftProtectionRebate;

    @ApiModelProperty(name = "申请车享包金额")
    private BigDecimal applyEnjoyPackFee;
    @ApiModelProperty(name = "批复车享包金额")
    private BigDecimal replyEnjoyPackFee;
    @ApiModelProperty(name = "车享包返佣金额")
    private BigDecimal enjoyPackRebate;
    @ApiModelProperty(name = "车享包包含项Code")
    private List<String> enjoyPackItemCodes;
    @ApiModelProperty(name = "车享包包含项Name")
    private List<String> enjoyPackItemNames;

}
