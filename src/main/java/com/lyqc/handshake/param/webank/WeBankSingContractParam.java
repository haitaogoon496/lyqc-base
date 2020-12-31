package com.lyqc.handshake.param.webank;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeBankSingContractParam extends WeBankBaseParam{
    //订单编号
    private String appCode;

    private String idType; //证件类型
    private String idno;    //证件号
    private String proppserName; //申请人姓名
    //合同协议
    private List<WeBankContractParam> contractBase;
    //签约日
    private String signDate;
    //确认借据时间
    private String confirmLoanTime;
    //操作系统
    private String osType;
    //签署渠道
    private String signChannel;

    //勾选时间
    private String checkTime;

    //活体影像件key
    private String imgKey;

    //活体影像件code
    private String imgCode;

    private Integer userId; //操作员号
    private String channel; //渠道

    //IP地址
    private String ipAdress;

    private String iosIdfa;//idfa
    private String androidImei;//imei
}
