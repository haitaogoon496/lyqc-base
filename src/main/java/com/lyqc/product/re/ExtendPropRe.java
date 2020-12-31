package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @description: 扩展属性Re对象
 * @see com.lyqc.product.enums.RateRuleExtendPropEnum
 * 业务场景：适用于ca_rate_rule的表的extend_props字段转换对象使用
 * @Date : 2018/11/26 下午2:57
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExtendPropRe extends BaseRe {
    /**
     * 属性编码
     */
    @ApiModelProperty(name="code",value="属性编码",dataType="String")
    private String code;
    /**
     * 属性名称
     */
    @ApiModelProperty(name="name",value="属性名称",dataType="String")
    private String name;
    /**
     * 属性值
     */
    @ApiModelProperty(name="value",value="属性值",dataType="BigDecimal")
    private BigDecimal value;
}
