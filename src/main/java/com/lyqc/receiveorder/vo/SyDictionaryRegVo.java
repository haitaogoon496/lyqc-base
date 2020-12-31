package com.lyqc.receiveorder.vo;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyDictionaryRegVo implements Serializable {
    private	String regCode;
    private	String regName;
    private	String regCodePar;
    private	String regLevel;
    private String gbCode;
    private	String memo;
    private String aliasName;
}
