package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 秒拒结果
 * Created by xiaoxian on 2018/7/12.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxSecondRefuseParam implements Serializable{
    private String retCode;
    private String retMsg;
    private String beforeResult;
    private String gztBadInfoDetail;
    private String mtGztBadInfoDetail;
    private String gtGztBadInfoDetail;
    private List<String> decisionMidVariable;
    private List<String> insRuleACodeList = new ArrayList();
    private List<String> insRuleBCodeList = new ArrayList();

    private String afterResult;
    private String workflowQueue;
    private String stragetyversion;
    private String stragetyversionDate;
    private String zhengxinAbnormal;
    private String testFlag;
    private String abnormalItem;
    private String mergeRcode;
    private String refuseRcode;
    private String riskNode;
    private String treeGroup;
}