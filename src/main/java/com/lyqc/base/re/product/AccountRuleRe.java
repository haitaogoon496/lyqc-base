package com.lyqc.base.re.product;

import java.math.BigDecimal;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description   账号规则实体类
 * @Date : 2018/3/15
 * @Author : 樊康康(kangkang.fan@mljr.com)
 */
@Data
public class AccountRuleRe extends BaseRe{

    private static final long serialVersionUID = -7753433872955276979L;
    @ApiModelProperty(name="limitScale",value="上限比例",dataType="BigDecimal")
    private BigDecimal limitScale;
    @ApiModelProperty(name="limitFee",value="上限金额",dataType="BigDecimal")
    private BigDecimal limitFee;
}
