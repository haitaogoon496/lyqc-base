package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class LyCarPostResult implements Serializable
{
    private static final long serialVersionUID = -7771621963951777660L;
    private String appcode;
    private String postResult;
    private String workflowQueue;
    private String stragetyversion;
    private String stragetyversionDate;
    private String testFlag;
    private String mergeRcode;
    private String refuseRcode;
    private String riskNode;
    private String treeGroup;
    private String insRuleCodeB;
    private BigDecimal evaCreditAmount;
    private int loanPeriods;

}
