package com.lyqc.receiveorder.param.bdx;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

/**
 * 紧急联系人
 * Created by xiaoxian on 2018/7/6.
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxEcontactParam implements Serializable{
    /**
     * 紧急联系人 VARCHAR(40)
     */
    private String eleContact;
    /**
     * 与主贷人关系 VARCHAR(10)
     */
    private String relationEContact;
    /**
     * 紧急联系人手机号码 VARCHAR(20)
     */
    private String eleContactMobile;


    /**
     * 紧急联系人2 VARCHAR(40)
     */
    private String eleContacts;
    /**
     * 与主贷人关系 VARCHAR(10)
     */
    private String relationEContacts;
    /**
     * 紧急联系人2号码 VARCHAR(20)
     */
    private String eleContactsMobile;
}
