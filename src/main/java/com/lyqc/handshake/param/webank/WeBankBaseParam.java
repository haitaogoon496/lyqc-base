package com.lyqc.handshake.param.webank;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeBankBaseParam implements Serializable {
    private String appCode;
}
