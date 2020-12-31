package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: GPS计算相关结果Re对象
 * @Date : 上午11:41 2018/4/8
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class GpsCalcResultRe extends BaseRe {
    @ApiModelProperty(name="gpsCount",value="GPS数量",dataType="Integer")
    private Integer gpsCount;
    @ApiModelProperty(name="gpsPro",value="GPS属性",dataType="String")
    private String gpsPro;
    @ApiModelProperty(name="gpsFee",value="GPS费用",dataType="BigDecimal")
    private BigDecimal gpsFee = BigDecimal.ZERO;
    @ApiModelProperty(name="baseGpsFee",value="基础GPS费用",dataType="BigDecimal")
    private BigDecimal baseGpsFee = BigDecimal.ZERO;
    @ApiModelProperty(name="gpsFloatFee",value="GPS浮动费",dataType="BigDecimal")
    private BigDecimal gpsFloatFee = BigDecimal.ZERO;
    @ApiModelProperty(name="gpsRebate",value="GPS返佣",dataType="BigDecimal")
    private BigDecimal gpsRebate = BigDecimal.ZERO;
}
