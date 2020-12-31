package com.lyqc.product.re;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 车贷产品Re对象
 * @Date : 2018/7/4 下午9:03
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductRe extends BaseRe {
    private static final long serialVersionUID = 2179872403924210552L;
    @ApiModelProperty(name="fundId",value="资金方ID",dataType="Integer")
    private Integer fundId;
    @ApiModelProperty(name="fundNo",value="资金方编号",dataType="String")
    private String fundNo;
    @ApiModelProperty(name="fundName",value="资金方名称",dataType="String")
    private String fundName;
    @ApiModelProperty(name="productId",value="产品ID",dataType="Integer")
    private Integer productId;
    @ApiModelProperty(name="productName",value="产品名称",dataType="String")
    private String productName;

    public ProductRe(Integer productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}
