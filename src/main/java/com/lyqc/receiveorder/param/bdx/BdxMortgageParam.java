package com.lyqc.receiveorder.param.bdx;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseAppCodeOpratorParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxMortgageParam extends BaseAppCodeOpratorParam {
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
}
