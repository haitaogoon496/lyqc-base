package com.lyqc.receiveorder.param.webank;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebankSignContractParam extends WebankBaseParam{
    //签约日
    private String signDate;
    //确认借据时间
    private String confirmLoanTime;
    //操作系统
    private String osType;
    //勾选时间
    private String checkTime;
    //活体影像件key
    private String imgKey;
    //活体影像件code
    private String imgCode;

    private String ipAddress;
    private String iosIdfa;//idfa
    private String androidImei;//imei

    private String idType; //证件类型
    private String idno;    //证件号
    private String proppserName; //申请人姓名

}
