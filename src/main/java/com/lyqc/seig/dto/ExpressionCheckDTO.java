package com.lyqc.seig.dto;

import com.alibaba.fastjson.JSONObject;
import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotEmpty;

/**
 * @description: 前置规则公式合法性验证DTO
 * @Date : 2018/9/10 下午5:01
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class ExpressionCheckDTO extends BaseDTO {
    private static final long serialVersionUID = 7085511642720927845L;
    @ApiModelProperty(name="expression",value="公式",dataType="String")
    @NotEmpty(message = "[expression]公式不能为空")
    private String expression;
    @ApiModelProperty(name="expressionEnv",value="公式参数环境",dataType="JSONObject")
    private JSONObject env;
}
