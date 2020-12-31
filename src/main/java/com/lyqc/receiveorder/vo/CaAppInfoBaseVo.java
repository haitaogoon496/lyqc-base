package com.lyqc.receiveorder.vo;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppInfoBaseVo implements Serializable {
    private String appCode;
}
