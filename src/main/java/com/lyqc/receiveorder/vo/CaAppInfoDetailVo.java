package com.lyqc.receiveorder.vo;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaAppInfoDetailVo extends CaAppInfoBaseVo{
    @ApiModelProperty(name = "主状态")
    private String status;

    @ApiModelProperty(name = "初审状态")
    private Integer flowStatus;

    @ApiModelProperty(name = "是否被标记位高风险")
    private boolean highRiskFlag;

    @ApiModelProperty(name = "贷后电子件状态")
    private String postLoanStatus;

    @ApiModelProperty(name = "首次提交审核时间")
    private Date firstSubmitTime;

    @ApiModelProperty(name = "初审退回原因")
    private String firstAuditBackReason;

    @ApiModelProperty(name = "退回原因")
    private String backReason;

    @ApiModelProperty(name = "渠道认证结果")
    private String chApprovalStatus;

}
