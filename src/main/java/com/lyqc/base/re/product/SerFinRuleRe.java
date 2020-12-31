package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 平台费规则Re对象
 * @Date : 下午3:36 2018/3/7
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class SerFinRuleRe extends BaseRe {
    private static final long serialVersionUID = 4566902457722237353L;
    /**
     * 融费率主键id
     */
    @ApiModelProperty(name="serFinRateId",value="融费率主键id",dataType="Integer")
    private Integer serFinRateId;
    /**
     * 融费率
     */
    @ApiModelProperty(name="rate",value="融费率",dataType="BigDecimal")
    private BigDecimal rate;
    /**
     * 基础平台费率
     */
    @ApiModelProperty(name="basicRate",value="基础平台费率",dataType="BigDecimal")
    private BigDecimal basicRate;
    /**
     * 融费返佣率
     */
    @ApiModelProperty(name="rebateRate",value="融费返佣率",dataType="BigDecimal")
    private BigDecimal rebateRate;
    /**
     * 高风险利率
     */
    @ApiModelProperty(name="highRate",value="高风险利率",dataType="BigDecimal")
    private BigDecimal highRate;
    /**
     * 收取方式
     * {@link com.lyqc.base.enums.SerFinConstant.TakenModeEnum}
     */
    @ApiModelProperty(name="takenMode",value="收取方式",dataType="Integer")
    private Integer takenMode;
    /**
     * 定价标签
     */
    @ApiModelProperty(name = "pricingLabel",value = "定价标签",dataType = "String")
    private String pricingLabel;
}
