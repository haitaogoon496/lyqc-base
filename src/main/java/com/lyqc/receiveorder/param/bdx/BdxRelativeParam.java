package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/5.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxRelativeParam implements Serializable{
    /**
     * 配偶姓名 VARCHAR(30)
     */
    private String relativesName;
    /**
     * 配偶身份证号码 VARCHAR(30)
     */
    private String idno;
    /**
     * 配偶手机号码 VARCHAR(20)
     */
    private String mobile;
    /**
     * 配偶户籍省份 VARCHAR(40)
     */
    private String province;
    /**
     * 配偶户籍城市 VARCHAR(40)
     */
    private String city;
    /**
     * 配偶户籍地址 VARCHAR(200)
     */
    private String address;
    /**
     * 配偶现居住省份 VARCHAR(40)
     */
    private String nowProvince;
    /**
     * 配偶现居住城市 VARCHAR(40)
     */
    private String nowCity;
    /**
     * 配偶现居住地址 VARCHAR(200)
     */
    private String nowAddress;
    /**
     * 配偶现工作单位名称 VARCHAR(80)
     */
    private String nowCompany;
    /**
     * 现工作单位省份 VARCHAR(40)
     */
    private String nowUnitProvince;
    /**
     * 现工作单位城市 VARCHAR(40)
     */
    private String nowUnitCity;
    /**
     * 配偶现工作单位地址 VARCHAR(200)
     */
    private String nowUnitAddress;

    /**
     * 生日 yyyyMMdd
     */
    private String birth;

    /**
     * 性别 1：男 0：女
     */
    private String sex;
    /**
     * 征信类型 1ZZ 2DZ
     */
    private String authType;
}
