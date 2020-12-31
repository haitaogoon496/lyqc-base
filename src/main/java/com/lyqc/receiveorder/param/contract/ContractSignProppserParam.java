package com.lyqc.receiveorder.param.contract;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/28.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractSignProppserParam implements Serializable{
    private String idno;

    private String mobile;

    private String proppserName;
}
