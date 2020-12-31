package com.lyqc.receiveorder.param.webank;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.bdx.BdxOperatorParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel
public class WebankFirstAuditParam extends WebankBaseParam {

    @ApiModelProperty(value = "操作人")
    private BdxOperatorParam operatorParam;

    @ApiModelProperty(value = "接收验证码手机号码")
    private String checkSmsMobile;

    @ApiModelProperty(value = "验短通过时间")
    private String checkSmsSucTime;

    @ApiModelProperty(value = "idfa")
    private String iosIdfa;

    @ApiModelProperty(value = "imei")
    private String androidImei;

    @ApiModelProperty(value = "操作系统")
    private String osType;

    @ApiModelProperty(value = "勾选时间")
    private String checkTime;//勾选时间

    @ApiModelProperty(value = "纳税人身份信息")
    private Integer taxStatement;//勾选时间

    @ApiModelProperty(value = "纳税人身份声明时间")
    private String taxStatementDate;//勾选时间

    @ApiModelProperty(value = "证件类型")
    private String idType;

    @ApiModelProperty(value = "证件号")
    private String idNo;

    @ApiModelProperty(value = "主贷人姓名")
    private String proppserName;

    @ApiModelProperty(value = "主贷人手机")
    private String mobile;
    //验证方式
    @ApiModelProperty(value = "触客模式")
    private String custVerifyType;

    @ApiModelProperty(value = "要素鉴权方式")
    private String repAccountCheckWays;

    @ApiModelProperty(value = "还款卡")
    private String repAccountLineNum;

    @ApiModelProperty(value = "还款卡银行预留手机")
    private String repBankMobile;

    @ApiModelProperty(value = "还款卡银行卡号")
    private String repAccountNo;

    @ApiModelProperty(value = "还款卡开户行")
    private String repAccountBank;

    @ApiModelProperty(value = "ip地址")
    private String ipAdress;
}
