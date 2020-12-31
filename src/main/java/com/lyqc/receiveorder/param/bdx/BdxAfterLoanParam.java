package com.lyqc.receiveorder.param.bdx;

import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseEnterInParam;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/24.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxAfterLoanParam extends BaseEnterInParam{

    /**
     * 出单保险公司
     * ca_car_info.INSURANCE_COMPANY
     */
    private String insuranceCompany;

    /**
     * 保险金额
     * ca_car_info.INSURED_AMOUNT
     */
    private BigDecimal insuredAmount;


    /**
     * 保险单号 ca_car_info
     */
    private String insuranceNo;
    /**
     * 保险单号类型（先添加上入参，还没落库） 1 我司出单 2 车商出单 3 客户出单 4 原保单
     */
    private Integer insuranceNoType;
    /**
     * 保险公司Code  ca_car_info
     */
    private String insuranceCode;

    /**
     * 是否提交贷后
     */
    private boolean submit;
}
