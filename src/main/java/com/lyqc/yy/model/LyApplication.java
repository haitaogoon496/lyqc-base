package com.lyqc.yy.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LyApplication implements Serializable
{
    private static final long serialVersionUID = -1959450894706502406L;
    private Long id;
    private String channel;
    private String productType;
    private String appCode;
    private String dealerName;
    private String companyName;
    private String isOld;
    private String isLcv;
    private BigDecimal salePrice;
    private String isGps;
    private BigDecimal gpsFee;
    private String isGpsLoan;
    private BigDecimal aSecureFee;
    private BigDecimal aCarloanAmount;
    private BigDecimal aLoanAmount;
    private BigDecimal aInitPayment;
    private BigDecimal aInitScale;
    private Integer aLoanPeriods;
    private BigDecimal aLoanRate;
    private String loanRecord;
    private BigDecimal appScore;
    private String repAccountBank;
    private String repAccountNo;
    private String repAccountName;
    private Date createTime;
    private Date appTime;
    private Date updateTime;
    private String productName;
    private BigDecimal disaRate;
    private String isCreditReport;
    private Integer aYanbaoTc;
    private String aYanbaoTcName;
    private String isCredit;
    private String rateLevel;
    private BigDecimal aComRate;
    private String outletCode;
    private String isAppOrder;
    private String productCode;
    private String appLatitude;
    private String appLongitude;
    private String appImei;
    private String appImsi;
    private String appMacId;
    private String productFlow;
    private String channelSpdb;
    private String userId;
    private String dealerCode;
    private String fuelType;
    private String nation;
    private String systemFlag;
    private String serialNo;
    private Double accountFee;
    private Double aComFee;
    private Double discountTrueE;

    /**
     * 0：首次调用风控
     * 1：初审核查完纸质授权书后调风控
     * 2：初审退回经销商后重新提交
     * 3：复审退回经销商后重新提交
     */
    @ApiModelProperty(name="riskNode",value="风控节点",dataType="Integer")
    @NotNull(message = "风控节点不能为空")
    private Integer riskNode;

}
