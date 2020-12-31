package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 计算车辆保险费Re对象
 * @Date : 2018/4/24 下午2:49
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class CalcCarTaxRe extends BaseRe {
    @ApiModelProperty(name="carCalcResultRe",value="车辆相关计算",dataType="CarCalcResultRe")
    private CarCalcResultRe carCalcResultRe;
    @ApiModelProperty(name="ruleMessages",value="费用规则校验信息",dataType="List<String>")
    private List<String> ruleMessages;
}
