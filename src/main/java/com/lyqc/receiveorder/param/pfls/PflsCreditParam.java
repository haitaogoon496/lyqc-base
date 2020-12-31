package com.lyqc.receiveorder.param.pfls;

import com.lyqc.receiveorder.param.BaseReiveorderOpratorParam;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PflsCreditParam extends BaseReiveorderOpratorParam {
    private String fundCode;

    private String appCode;

    @ApiModelProperty(name = "门店名")
    private String dealerName;

    @ApiModelProperty(name = "销售名")
    private String staffName;

    //签发机关
    @ApiModelProperty(name = "身份证签发机关")
    private String signOrganization;

    @ApiModelProperty(name = "所在城市地区码")
    private String regCode;
}
