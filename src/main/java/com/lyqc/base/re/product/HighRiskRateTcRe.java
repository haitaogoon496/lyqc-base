package com.lyqc.base.re.product;

import java.math.BigDecimal;

import javax.swing.plaf.basic.BasicIconFactory;

import com.lyqc.base.common.BaseRe;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 高风险高定价平台费率对照
 * Created by xiaoxian on 2018/3/29.
 */
@Data
public class HighRiskRateTcRe extends BaseRe{
    /**
     * 平台费率
     */
    @ApiModelProperty(name="serFinRate",value="平台费率",dataType="BigDecimal")
    private BigDecimal serFinRate;

    /**
     * 高风险平台费率
     */
    @ApiModelProperty(name="highRiskRate",value="高风险平台费率",dataType="BigDecimal")
    private BigDecimal highRiskRate;
}
