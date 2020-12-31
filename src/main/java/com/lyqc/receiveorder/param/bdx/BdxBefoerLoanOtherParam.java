package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;
import java.math.BigDecimal;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 贷前补充资料
 * Created by xiaoxian on 2018/8/20.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxBefoerLoanOtherParam implements Serializable{

    /**
     * 先放后抵才有
     * ca_app_info.two_level
     */
    private Integer subFlowSeq;

    /**
     * 客户是否到场
     * ca_app_info.arrive
     */
    private String arrive;

    /**
     * 出单保险公司 进入ca_car_info
     * ca_car_info.INSURANCE_COMPANY
     */
    private String insuranceCompany;

    /**
     * 保险金额 ca_car_info
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
     * 抵押省市  国标码
     * ca_car_info.mortgage_city_code
     */
    private String mortgageCityCode;

    /**
     * 抵押城市 名称
     * ca_car_info.mortgage_city_name
     */
    private String mortgageCityName;

    /**
     * 抵押渠道
     * ca_car_info.mortgage_channel
     */
    private String mortgageChannel;

    /**
     * ca_app_company
     * 公牌车辆补充信息
     */
    private BdxPublicLicenseParam publicLicenseParam;//公牌信息
}
