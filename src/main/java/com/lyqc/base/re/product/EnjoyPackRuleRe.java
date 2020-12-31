package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * @description: 超享包规则返回对象
 * @Date : 2019/1/11 14:29
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnjoyPackRuleRe extends BaseRe{

    /**
     * 超享包规则名称
     */
    @ApiModelProperty(name="enjoyPackName",value="超享包名称",dataType="String")
    private String enjoyPackName;

    @ApiModelProperty(name="enjoyPackFee",value="超享包金额",dataType="BigDecimal")
    private BigDecimal enjoyPackFee;

    @ApiModelProperty(name="enjoyPackRebate",value="超享包返佣金额",dataType="BigDecimal")
    private BigDecimal enjoyPackRebate;

    @ApiModelProperty(name="enjoyPackItem",value="超享包包含项目Code",dataType="List<String>")
    private List<String> enjoyPackItemCodes;

    @ApiModelProperty(name="enjoyPackItemNames",value="超享包包含项目名称",dataType="List<String>")
    private List<String> enjoyPackItemNames;
}
