package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @description: 车贷产品简单信息 Re对象
 * 业务场景：适用于获取简约版的产品信息接口
 * @Date : 2018/2/27 下午6:24
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductSimpleInfoRe extends BaseRe {
    private static final long serialVersionUID = -1600845940823715543L;
    @ApiModelProperty(name="productCode",value="产品编码",dataType="String")
    private String productCode;
    @ApiModelProperty(name="productName",value="产品名称",dataType="String")
    private String productName;
    @ApiModelProperty(name="type",value="产品分类",dataType="Integer")
    private Integer type;
    @ApiModelProperty(name="isPF",value="是否浦发产品(1:是 0:否)",dataType="String")
    private String isPF;
    @ApiModelProperty(name="fundSource",value="产品缩写",dataType="String")
    private String fundSource;
    @ApiModelProperty(name = "fundCode", value = "资金方编码", dataType = "String")
    private String fundCode;
    @ApiModelProperty(name = "fundName", value = "资金方名称", dataType = "String")
    private String fundName;
}
