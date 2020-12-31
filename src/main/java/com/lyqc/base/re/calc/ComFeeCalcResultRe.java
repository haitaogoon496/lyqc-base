package com.lyqc.base.re.calc;

import java.math.BigDecimal;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description 平台费相关计算结果
 * 版本修改：
 * 2018/8/9：新增基础平台费率接口 add by 石冬冬
 * @Date : 2018/4/10
 * @Author : 樊康康(kangkang.fan@mljr.com)
 */
@Data
public class ComFeeCalcResultRe extends BaseRe {

    @ApiModelProperty(name="comFee",value="平台费(基本+浮动)",dataType="BigDecimal")
    private BigDecimal comFee = BigDecimal.ZERO;
    /**
     * 业务说明：该字段映射到ca_ser_fin_rate中的basic_rate字段
     */
    @ApiModelProperty(name="comFeeBasicRate",value="基础平台费率",dataType="BigDecimal")
    private BigDecimal comFeeBasicRate;

    @ApiModelProperty(name="comFeeRate",value="平台费率",dataType="BigDecimal")
    private BigDecimal comFeeRate = BigDecimal.ZERO;

    @ApiModelProperty(name="baseComFee",value="基本平台费",dataType="BigDecimal")
    private BigDecimal baseComFee = BigDecimal.ZERO;

    @ApiModelProperty(name="baseComFeeRate",value="基本平台费率",dataType="BigDecimal")
    private BigDecimal baseComFeeRate = BigDecimal.ZERO;

    @ApiModelProperty(name="comFloatFee",value="平台浮动费",dataType="BigDecimal")
    private BigDecimal comFloatFee = BigDecimal.ZERO;

    @ApiModelProperty(name="comFloatFeeRate",value="平台浮动费率",dataType="BigDecimal")
    private BigDecimal comFloatFeeRate = BigDecimal.ZERO;

    @ApiModelProperty(name="serFinRebate",value="平台费返佣费率",dataType="BigDecimal")
    private BigDecimal serFinRebate = BigDecimal.ZERO;

    @ApiModelProperty(name="applyOfflineComFee",value="申请线下平台费金额,（已废弃，请使用offlineComFee）",dataType="BigDecimal")
    @Deprecated
    private BigDecimal applyOfflineComFee;

    @ApiModelProperty(name="replyOfflineComFee",value="批复线下平台费金额,（已废弃，请使用offlineComFee）",dataType="BigDecimal")
    @Deprecated
    private BigDecimal replyOfflineComFee;

    @ApiModelProperty(name="offlineComFee",value="线下平台费金额,产品中心不关注申请还是批复",dataType="BigDecimal")
    private BigDecimal offlineComFee;

    @ApiModelProperty(name = "pricingLabel",value = "定价标签",dataType = "String")
    private String pricingLabel;
}
