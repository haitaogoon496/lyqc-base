package com.lyqc.receiveorder.param;

import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OnUpdateNotifyParam extends BaseAppCodeOpratorParam{
    Map<String,Object> changeList;

}
