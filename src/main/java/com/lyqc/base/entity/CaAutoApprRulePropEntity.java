package com.lyqc.base.entity;

import com.lyqc.base.enums.AutoApprConstant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 订单费用信息
 * @Date : 2018/12/3 下午3:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CaAutoApprRulePropEntity {
    /**
     * 所属规则ID
     */
    private String ruleId;
    /**
     * 属性代码
     */
    private String propCode;
    /**
     * 属性名称
     */
    private String propName;
    /**
     * 操作符
     * {@link AutoApprConstant.OpIdnEnum#getName()}  }
     */
    private String opIdn;
    /**
     * 属性值
     */
    private String propValue;
    /**
     * 属性值
     */
    private String propValueBak;
    /**
     * 属性类型
     * {@link AutoApprConstant.PropValueTypeEnum#getName()}
     */
    private Integer propValueType;
}