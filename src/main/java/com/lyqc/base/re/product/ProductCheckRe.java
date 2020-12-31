package com.lyqc.base.re.product;

import com.lyqc.base.common.BaseRe;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by xiaoxian on 2018/4/8.
 */
@Data
public class ProductCheckRe extends BaseRe{
    @ApiModelProperty(name="dealerCode",value="门店code",dataType="String")
    private Integer dealerCode;
    @ApiModelProperty(name="productCode",value="产品code",dataType="String")
    private Long productCode;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="checkPass",value="是否通过",dataType="Boolean")
    private Boolean checkPass;
    @ApiModelProperty(name="checkMsg",value="检查结果",dataType="String")
    private String checkMsg;
}
