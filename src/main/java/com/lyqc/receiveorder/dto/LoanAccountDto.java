package com.lyqc.receiveorder.dto;

import java.io.Serializable;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

/**
 * 放款账户
 * Created by xiaoxian on 2018/6/21.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanAccountDto implements Serializable{
    @NotBlank(message = "账户类型必须填写")
    private String loanAccountType ;// "2", //1对私 2对公

    private String loanAccountTypeName ;// "2", //账户类型，1对私 2对公

    @NotBlank(message = "所在城市必须填写")
    private String loanAccountCity;// "廊坊市", //所在城市

    @NotBlank(message = "所在省必须填写")
    private String loanAccountProvince ;// "河北省", //所在省

    private String branchBankCode;// "969585001044", //银行联行号

    private String createUserId;// 2000000101, //销售id，非必传

    private String createUserName;// "xiaoming", //销售名，非必传

    private String loanAccountBranchBankName;// "燕郊支行", //开户支行

    @NotBlank(message = "开户行必须填写")
    private String loanAccountBankName;// "中国邮政储蓄银行", //开户银行

    @NotBlank(message = "身份证号必须填写")
    private String loanAccountIdno;// "11010119880818501432X", //证件号码

    @NotBlank(message = "收款账户姓名必须填写")
    private String loanAccountName;// "张三", //收款账户姓名

    @NotBlank(message = "卡号必须填写")
    private String loanAccountNo;// "6552457784956683", //收款借记卡号&放款账户

    private String recordMobile;// "18510322370" //预留手机号
}
