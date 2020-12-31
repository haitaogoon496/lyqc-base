package com.lyqc.receiveorder.param.query;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseReiveorderParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppCodeParam extends BaseReiveorderParam {
    private String appCode;
}
