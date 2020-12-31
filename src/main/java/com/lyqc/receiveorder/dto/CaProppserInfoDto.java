package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

/**
 * @author huyue
 * @date 2018/9/28 16:26
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CaProppserInfoDto implements Serializable {

    /**
     * 户籍省份
     */
    private String province;

    /**
     * 户籍城市
     */
    private String city;

    /**
     * 现居住省份
     */
    private String nowProvince;

    /**
     * 现居住地址
     */
    private String nowCity;

    /**
     * 申请人移动电话2
     */
    private String mobiles;

    /**
     * 申请人姓名
     */
    private String proppserName;

    /**
     * 证件号码
     */
    private String idno;

    /**
     * 申请人移动电话
     */
    private String mobile;

    /**
     * 现居住地址
     */
    private String nowAddress;

    /**
     * 户籍地址
     */
    private String address;
}
