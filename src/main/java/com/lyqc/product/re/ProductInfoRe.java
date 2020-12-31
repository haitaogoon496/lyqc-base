package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 资金方选择产品Re对象
 * @Date : 2018/7/3 下午6:10
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfoRe extends BaseRe {
    private static final long serialVersionUID = -4048132227720722924L;
    @ApiModelProperty(name="productName",value="产品名称",dataType="String")
    private String productName;
}
