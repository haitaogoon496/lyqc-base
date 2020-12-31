package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 计算平台费Re对象
 * @Date : 下午5:35 2018/4/24
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class CalcSerFinFeeRe extends BaseRe {

    @ApiModelProperty(name="comFeeCalcResultRe",value = "平台费相关计算",dataType = "ComFeeCalcResultRe")
    private ComFeeCalcResultRe comFeeCalcResultRe;

    @ApiModelProperty(name="ruleMessages",value="费用规则校验信息",dataType="List<String>")
    private List<String> ruleMessages;

}
