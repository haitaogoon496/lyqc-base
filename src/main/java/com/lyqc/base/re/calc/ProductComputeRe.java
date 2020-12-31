package com.lyqc.base.re.calc;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @description: 产品计算引擎计算结果Re对象
 * @Date : 下午7:51 2018/4/11
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductComputeRe extends BaseRe {
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="graySwitch",value="灰度是否准入",dataType="graySwitch")
    private boolean graySwitch;
    @ApiModelProperty(name="calcResultRe",value="费用项计算结果",dataType="CalcResultRe")
    private CalcResultRe calcResultRe;
    @ApiModelProperty(name="ruleMessages",value="费用规则校验信息",dataType="List<String>")
    private List<String> ruleMessages;
}
