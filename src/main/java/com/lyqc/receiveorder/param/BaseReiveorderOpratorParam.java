package com.lyqc.receiveorder.param;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.bdx.BdxOperatorParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseReiveorderOpratorParam extends BaseReiveorderParam{
    private BdxOperatorParam operatorParam;
}
