package com.lyqc.poseidon.param;

import com.lyqc.base.re.calc.CalcResultRe;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class CaAppInfo implements Serializable {
    private static final long serialVersionUID = 1589876852774903727L;

    private Integer appNo;

    private String appCode;

    private Integer proppserId;

    private Integer carId;

    private Integer dealerCode;

    private String dealerName;

    private String companyName;

    private String isOld;

    private String isLcv;

    private BigDecimal salePrice;

    private String isGps;

    private BigDecimal gpsFee;

    private String isGpsLoan;

    private BigDecimal aCarloanAmount;

    private BigDecimal aLoanAmount;

    private BigDecimal aInitPayment;

    private BigDecimal aInitScale;

    private Integer aLoanPeriods;

    private BigDecimal aLoanRate;

    private String loanRecord;

    private BigDecimal appScore;

    private BigDecimal rLoanAmount;

    private BigDecimal rInitPayment;

    private BigDecimal rInitScale;

    private Integer rLoanPeriods;

    private BigDecimal rLoanRate;

    private String repAccountBank;

    private String repAccountNo;

    private String repAccountName;

    private Date createTime;

    private Date appTime;

    private Date updateTime;

    private Date loanerApprovalTime;

    private Date manageApprovalTime;

    private Date bloanDataTime;

    private Date bloanApprovalTime;

    private Date aloanDataTime;

    private Date aloanApprovalTime;

    private Date loanTime;

    private String aloanArrive;

    private String cancelType;

    private String cancelReason;

    private String status;

    private String remarks;

    private String isAssure;

    private Integer companyCode;

    private Integer userId;

    private String userName;

    private Integer flowSeq;

    private String isDeferMortgage;

    private Integer productCode;

    private String productName;

    private BigDecimal rGpsFee;

    private BigDecimal aSecureFee;

    private Double rSecureFee;

    private String isPrintW;

    private String isHouse;

    private String loanRemarks;

    private String bloanRemarks;

    private String sysaRemarks;

    private String yyRiskRemarks;

    private String yyPreRiskRemarks;

    private Date sysaDate;

    private String sysaStatus;

    private String sysaResult;

    private String refuseStatus;

    private String isPrepay;

    private Date prepayDate;

    private BigDecimal extraLoanAmount;

    private String paymentCh;

    private Date dateCh;

    private String paymentChZn;

    private BigDecimal discountE;

    private BigDecimal disaRate;

    private BigDecimal discountTrueE;

    private BigDecimal rDiscountTrueE;

    private String fyRemarks;

    private String loanStatus;

    private String isCreditReport;

    private String modelIds;

    private BigDecimal aComRate;

    private BigDecimal aComFee;

    private BigDecimal aYanbaoFee;

    private Double aYanbaoFee3;

    private Integer aYanbaoTc;

    private Integer aYanbaoTc3;

    private String aYanbaoTcName;

    private String aYanbaoTcName3;

    private BigDecimal aLifeInsurance;

    private Double rLifeInsurance;

    private String lifeInsuranceRule;

    private BigDecimal lifeInsuranceRate;

    private BigDecimal rComFee;

    private BigDecimal rYanbaoFee;

    private Double rYanbaoFee3;

    private String chApprovalStatus;

    private String pledModelId;

    private String authCh;

    private String paymentChEn;

    private String fileNumber;

    private String postLoanStatus;

    private String loanAfterRemarks;

    private String loanAfterCondition;

    private String isCredit;

    private String rateLevel;

    private String rRateLevel;

    private BigDecimal accountFee;

    private BigDecimal rAccountFee;

    private BigDecimal rCarloanAmount;

    private String loanFileStatus;

    private String belongDealer;

    private String belongSale;

    private String belongSaleManager;

    private String belongOperation;

    private String belongMarket;

    private String repAccountIdno;

    private String isCheckAccount;

    private String gpsLevel;

    private Date gpsConfirmDate;

    private BigDecimal gpsRebate;

    private BigDecimal serFinRebate;

    private String comeFrom;

    private String belongSaleTel;

    private String isPreInterest;

    private BigDecimal rGrossInterest;

    private BigDecimal grossInterest;

    private BigDecimal extendCost;

    private BigDecimal rExtendCost;

    private String extendId;

    private String extendName;

    private BigDecimal preLoanRate;

    private String autoAppr;

    private Date autoApprTime;

    private Date firstSubmit;

    private String workflowQueue;

    private String batchPayFlag;

    private String sendAppr;

    private String yyApprovalResult;

    private String isCertAll;

    private String isAuthYh;

    private String loanAfterYuanRemarks;

    private String isVipContract;

    private Integer isQuickAudit;

    private String assign;

    private String repAccountMobile;

    private Integer isBack;

    private Integer isEndHt;

    private Integer htSource;

    private Integer isEndContract;

    private Integer isCompanyLicense;

    private BigDecimal icbcAssessmentPrices;

    private BigDecimal notarizationFee;

    private Integer quickAuditSign;

    private String repAccountLineNum;

    private String repAccountCheckWays;

    private Double rBusinessInsurance;

    private BigDecimal rTrafficInsurance;

    private BigDecimal rTaxPrice;

    private String webankno;

    private String belongSubSale;

    private String shiftFileNumber;

    private Integer pufaBackType;

    private String isHighRisk;

    private Integer gpsCount;//gps数量
    private String gpsPro;//gps属性

    private CalcResultRe calcResultRe;
}
