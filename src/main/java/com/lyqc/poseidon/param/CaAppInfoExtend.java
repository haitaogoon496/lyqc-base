package com.lyqc.poseidon.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CaAppInfoExtend implements Serializable {
    private static final long serialVersionUID = 8430930885071430919L;

    private Integer id;

    private String appCode;

    private Integer takenMode;

    private Integer offlineComFeePayStatus;

    private String offlineComFeePayResult;

    private BigDecimal highComRate;

    private BigDecimal highRate;

    private Integer highProductId;

    private Integer showHighRate;

    private String highRateProduct;

    private Integer isAgreeHighRiskProduct;

    private String oldProductName;

    private Integer oneLevel;
    private Integer twoLevel;
    private String arrive;
    private Integer newLoanStatus;

    private Integer highType;

    private Integer finalWait;
    private Integer subStatus;
    private Date firstExamineTime;

    private Date secondExamineTime;

    private Date finalExamineTime;

    private Date loanBeforeTime;

    private short flowStatus;

    private Integer userId;

    private Integer acceptStatus;

    private Date applyTime;

    private String fundCode;
    private String message;
    /**
     * LTV使用状态
     */
    private Integer ltvStatus;
    /**
     * LTV类型
     */
    private Integer ltvType;
    /**
     * LTV调整价
     */
    private BigDecimal ltvAmount;
    /**
     * 优质用户
     */
    private Integer highQualityUser;
    /**
     * 历史审批数据
     */
    private String historicalRecords;
    /**
     * 优质用户辅助状态 0=未过，1=已过
     */
    private Integer highQualityUserStatus;

    /**
     * 资方成本利率
     */
    private BigDecimal costRate;
}
