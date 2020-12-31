package com.lyqc.base.re.product.expression;

import com.lyqc.base.common.BaseRe;
import lombok.Data;

import java.util.List;

/**
 * @description: 产品规则公式基类
 * @Date : 2018/4/12 下午9:35
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class BaseExpressionRe extends BaseRe {
    /**
     * 规则计算公式
     */
    public String ruleExpression;
    /**
     * 规则校验信息
     * 如果没有根据相应规则找到公式，则返回相关业务规则校验信息
     */
    private List<String> ruleMessages;
}
