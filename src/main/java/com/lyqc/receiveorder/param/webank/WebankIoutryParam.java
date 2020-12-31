package com.lyqc.receiveorder.param.webank;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.bdx.BdxOperatorParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebankIoutryParam extends WebankBaseParam {

    @ApiModelProperty(value = "证件类型")
    private String idType;

    @ApiModelProperty(value = "证件号")
    private String idno;

    @ApiModelProperty(value = "申请人姓名")
    private String proppserName;

    @ApiModelProperty(value = "渠道")
    private String channel;
}
