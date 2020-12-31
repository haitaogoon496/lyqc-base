package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 公牌信息
 * 指卖方为公司产权的情况
 * Created by xiaoxian on 2018/8/20.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxPublicLicenseParam implements Serializable{
    /**
     * 注册公司名称
     */
    private String companyName;

    /**
     * 注册公司地址
     */
    private String companyAdress;

    /**
     * 注册公司电话
     */
    private String companyPhone;

    /**
     * 统一社会信用代码
     */
    private String companyRegCode;

    /**
     * 法人、经营者
     */
    private String legalName;

    /**
     * 法人身份证
     */
    private String legalIdNo;

    /**
     * 法人手机号
     */
    private String legalMobile;
}
