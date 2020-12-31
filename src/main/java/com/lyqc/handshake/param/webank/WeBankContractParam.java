package com.lyqc.handshake.param.webank;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeBankContractParam implements Serializable {

    @ApiModelProperty(value = "合同名称")
    private String contractName;

    @ApiModelProperty(value = "合同版本号")
    private String contractVer;

    @ApiModelProperty(value = "合同勾选时间")
    private String contractCheckTime;
}
