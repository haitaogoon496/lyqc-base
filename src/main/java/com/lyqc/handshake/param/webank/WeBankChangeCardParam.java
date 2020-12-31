package com.lyqc.handshake.param.webank;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeBankChangeCardParam extends WeBankBaseParam {
    private String repAccountCheckWays; //还款卡验证方式
    private String repAccountNo;//还款借记卡卡号
    private String repAccountBank;//还款借记卡开户行
    private String repAccountLineNum;  //还款卡联行号
    private String repBankMobile;//还款银行预留手机号
    private Integer userId; //操作员号
    private String proppserName; //申请人姓名
    private String idno;    //证件号
    private String idType; //证件类型
    private String channel; //渠道
    private String ipAdress;//IP地址
    private String applyTime;//申请提交时间
    private List<WeBankContractParam> contractBase; //合同协议

}
