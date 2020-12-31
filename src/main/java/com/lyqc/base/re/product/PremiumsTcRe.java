package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @description: 第二/三年保险费规则相应套餐Re对象
 * @Date : 下午4:00 2018/3/16
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class PremiumsTcRe extends BaseRe {
    /**
     * 规则Id
     */
    @ApiModelProperty(name="ruleSeq",value="规则Id",dataType="Integer")
    private Integer ruleSeq;
    /**
     * 保险费套餐Id
     */
    @ApiModelProperty(name="tcId",value="保险费套餐Id",dataType="Integer")
    private Integer tcId;
    /**
     * 保险费套餐名称
     */
    @ApiModelProperty(name="tcName",value="保险费套餐名称",dataType="String")
    private String tcName;
    /**
     * 保险费套餐金额
     */
    @ApiModelProperty(name="tcFee",value="保险费套餐金额",dataType="BigDecimal")
    private BigDecimal tcFee;
}
