package com.lyqc.receiveorder.param.webank;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseReiveorderOpratorParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebankBaseParam extends BaseReiveorderOpratorParam {
    private String appCode;
}
