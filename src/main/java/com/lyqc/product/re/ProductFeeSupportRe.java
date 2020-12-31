package com.lyqc.product.re;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description:  返回经销商门店支持的产品费用类型。
 * @Date : 2018/10/12 11:52
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
public class ProductFeeSupportRe {
    @ApiModelProperty(name = "accountFeeSupport", value = "是否支持账户管理费", dataType = "accountFeeSupport")
    boolean accountFeeSupport;
}
