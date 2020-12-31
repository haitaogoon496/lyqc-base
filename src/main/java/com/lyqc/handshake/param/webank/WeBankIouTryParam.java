package com.lyqc.handshake.param.webank;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 微众借据试算接口
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeBankIouTryParam extends WeBankBaseParam {
    private String idType; //证件类型
    private String idno;    //证件号
    private String proppserName; //申请人姓名
    private Integer userId; //操作员号
    private String channel; //渠道
}
