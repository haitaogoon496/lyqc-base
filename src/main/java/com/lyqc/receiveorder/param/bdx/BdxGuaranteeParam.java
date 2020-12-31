package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 担保人
 * Created by xiaoxian on 2018/7/5.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxGuaranteeParam implements Serializable{
    /**
     * 担保人与申请人关系 CHAR(2)
     */
    private String relationGFl;
    /**
     * 担保人姓名 VARCHAR(30)
     */
    private String guaranteeName;
    /**
     * 担保人身份证号码 VARCHAR(30)
     */
    private String idno;
    /**
     * 担保人手机号码 VARCHAR(20)
     */
    private String mobile;
    /**
     * 户籍省份 VARCHAR(40)
     */
    private String province;
    /**
     * 户籍城市 VARCHAR(40)
     */
    private String city;
    /**
     * 担保人户籍地址 VARCHAR(200)
     */
    private String address;
    /**
     * 现居住省份 VARCHAR(40)
     */
    private String nowProvince;
    /**
     * 现居住城市 VARCHAR(40)
     */
    private String nowCity;
    /**
     * 担保人现居住地址 VARCHAR(200)
     */
    private String nowAddress;
    /**
     * 担保人现工作单位名称 VARCHAR(80)
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
     * 担保人现工作单位地址 VARCHAR(200)
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
