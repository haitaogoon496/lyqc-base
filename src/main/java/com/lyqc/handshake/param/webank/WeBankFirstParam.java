package com.lyqc.handshake.param.webank;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeBankFirstParam extends WeBankBaseParam {
    //合同协议
    private List<WeBankContractParam> contractBase;
    //接收验证码手机号码
    private String checkSmsMobile;
    //验短通过时间
    private String checkSmsSucTime;
    //申请提交时间
    private String applyTime;
    //IP地址
    private String ipAdress;
    //idfa
    private String iosIdfa;
    //imei
    private String androidImei;
    //操作系统
    private String osType;
    //纳税人身份信息
    private Integer taxStatement;
    //纳税人身份声明时间
    private String taxStatementDate;

    private String userId;
    private String channel;
    private String idType;
    private String idno;
    private String proppserName;
    private String mobile;
    //验证方式
    private String custVerifyType;
    private String repAccountCheckWays;
    private String repAccountLineNum;
    private String repBankMobile;
    private String repAccountNo;
    private String repAccountBank;


}
