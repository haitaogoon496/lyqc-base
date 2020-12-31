package com.lyqc.base.re.product.expression;

import lombok.Data;

/**
 * @description:【贴息类规则】表达式
 * @Date : 2018/4/12 下午9:35
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class DiscountExpressionRe extends BaseExpressionRe{
    /**
     * 计算方式  1 贴金额、 2 贴点数
     * {@link com.lyqc.base.enums.ProductConstant.ComFlagEnum}
     */
    public Integer comFlag;
}
