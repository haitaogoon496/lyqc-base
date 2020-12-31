package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: GPS费用规则
 * @Date : 2018/3/22 下午3:42
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class GpsRuleRe extends BaseRe {
    private static final long serialVersionUID = 4566902457722237353L;
    /**
     * GPS费用
     */
    @ApiModelProperty(name="gpsFee",value="GPS费用",dataType="BigDecimal")
    private BigDecimal gpsFee;
    /**
     * GPS返佣
     */
    @ApiModelProperty(name="rebate",value="GPS返佣",dataType="BigDecimal")
    private BigDecimal rebate;
    /**
     * GPS数量
     */
    @ApiModelProperty(name="gpsCount",value="GPS数量",dataType="Integer")
    private Integer gpsCount;
    /**
     * GPS属性
     * {@link com.lyqc.base.enums.CarGpsConstant.GpsProEnum}
     */
    @ApiModelProperty(name="gpsPro",value="GPS属性",dataType="Integer")
    private Integer gpsPro;
    @ApiModelProperty(name="level",value="GPS档位",required = false,dataType="Integer")
    private Integer level;
    @ApiModelProperty(name="levelName",value="GPS档位名称",dataType="String")
    private String levelName;
}
