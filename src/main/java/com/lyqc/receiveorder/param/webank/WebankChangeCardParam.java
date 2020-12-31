package com.lyqc.receiveorder.param.webank;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.handshake.param.webank.WeBankContractParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WebankChangeCardParam extends WebankBaseParam {

    @ApiModelProperty(value = "还款卡验证方式")
    private String repAccountCheckWays;

    @ApiModelProperty(value = "还款借记卡卡号")
    private String repAccountNo;

    @ApiModelProperty(value = "还款借记卡开户行")
    private String repAccountBank;

    @ApiModelProperty(value = "还款卡联行号")
    private String repAccountLineNum;

    @ApiModelProperty(value = "还款银行预留手机号")
    private String repBankMobile;

    @ApiModelProperty(value = "申请人姓名")
    private String proppserName;

    @ApiModelProperty(value = "证件号")
    private String idno;

    @ApiModelProperty(value = "证件类型")
    private String idType;

    @ApiModelProperty(value = "渠道")
    private String channel;

    @ApiModelProperty(value = "IP地址")
    private String ipAdress;

    @ApiModelProperty(value = "申请提交时间")
    private String applyTime;
}
