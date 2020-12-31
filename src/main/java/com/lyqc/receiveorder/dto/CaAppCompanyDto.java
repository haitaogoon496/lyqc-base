package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * User: HY
 * Date: 2019/1/8
 * Time: 15:20
 * Description:
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppCompanyDto implements Serializable {

    private Long registeredCompanyId;

    private String appCode;

    private String registeredCompanyName;

    private String registeredCompanyCode;

    private String registeredCompanyAddress;

    private String registeredCompanyTel;
}
