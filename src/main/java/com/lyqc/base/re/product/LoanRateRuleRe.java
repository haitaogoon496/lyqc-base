package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import com.lyqc.product.re.ExtendPropRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 贷款利率Re对象
 * @Date : 下午2:27 2018/4/9
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class LoanRateRuleRe extends BaseRe {
    /**
     * 利率档位
     */
    @ApiModelProperty(name="rateLevel",value="利率档位",dataType="Integer")
    private Integer rateLevel;
    /**
     * 利率档位名称（对应数据字典维护的名称）
     */
    @ApiModelProperty(name="rateLevelName",value="利率档位名称",dataType="String")
    private String rateLevelName;
    /**
     * 贷款利率
     */
    @ApiModelProperty(name="rateValue",value="贷款利率",dataType="BigDecimal")
    private BigDecimal rateValue;
    /**
     * 高风险利率
     */
    @ApiModelProperty(name="highRate",value="高风险利率",dataType="BigDecimal")
    private BigDecimal highRate;
    /**
     * 扩展属性
     * @see com.lyqc.product.enums.RateRuleExtendPropEnum
     */
    @ApiModelProperty(name="extendProps",value="扩展属性",dataType="List<ExtendPropRe>")
    private List<ExtendPropRe> extendProps;
}
