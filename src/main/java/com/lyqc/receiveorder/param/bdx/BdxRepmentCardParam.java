package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 贷前-还款卡资料
 * Created by xiaoxian on 2018/8/14.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxRepmentCardParam implements Serializable {

    @ApiModelProperty(value = "还款卡联行号")
    private String repAccountLineNum;

    @ApiModelProperty(value = "还款人证件号")
    private String repAccountIdno;

//    @ApiModelProperty(value = "还款卡验证方式")
//    private String repAccountCheckWays; //全是四要素

    @ApiModelProperty(value = "还款卡开户行")
    private String repAccountBank;

    @ApiModelProperty(value = "还款卡号")
    private String repAccountNo;

    @ApiModelProperty(value = "还款借记卡户名")
    private String repAccountName;

    @ApiModelProperty(value = "还款卡银行预留手机号")
    private String repAccountMobile;

    @ApiModelProperty(value = "业务号---支付")
    private String sourceBizIdForPayment;

//    @ApiModelProperty(value = "状态验卡：0为未验证，1为已验证")
//    private String isCheckAccount;
}
