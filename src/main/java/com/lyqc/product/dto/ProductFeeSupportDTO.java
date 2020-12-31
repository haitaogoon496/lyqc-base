package com.lyqc.product.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotEmpty;

/**
 * @description:  查询经销商门店支持的产品费用类型。
 * @Date : 2018/10/12 11:56
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
public class ProductFeeSupportDTO {
    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    @NotEmpty
    private Integer dealerCode;
}
