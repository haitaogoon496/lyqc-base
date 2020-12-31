package com.lyqc.receiveorder.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

/**SY经销商门店
 * @author huyue
 * @date 2018/9/28 11:38
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SyDealerDto implements Serializable {

    private Integer dealerCode;

    private String dealerName;

    private String dealerType;

    private Integer companyCode;

    private String recAccountName;

    private String recAccountCard;

    private String recAccountBank;

    private String bankProvince;

    private String bankCity;

    private String recAccountNo;

    private String address;

    private String rtamil;

    private String am;

    private String sv;

    private String gmName;

    private String gmMobile;

    private String gmPhone;

    private String gmEmail;

    private String smName;

    private String smMobile;

    private String smPhone;

    private String smPsw;

    private String smEamil;

    private String fmName;

    private String fmMobile;

    private String fmPhone;

    private String fmEamil;


    private String fmPsw;


    private String mmName;


    private String mmMobile;


    private String mmPhone;

    private String mmEamil;


    private String saleName;


    private String saleMobile;


    private String salePhone;


    private String saleEmail;


    private String trainName;


    private String trainMobile;


    private String trainPhone;


    private String trainEmail;


    private Date clcType;


    private String serverInvoiceName;


    private String serverInvoiceType;


    private String dealerEmail;


    private String contactPerson;


    private String accountName;


    private String remarks1;

    private String interestRate;

    private String provinceRate;

    private String status;

    private Date onlineTime;

    private Date updateTime;

    private String remarks;

    private String saleArea;


    private String province;


    private String city;

    private String recAccountBank2;

    private String accountType;


    private String bankMobile;


    private String lineNumber;

    private Byte isFraudFlight;

    private Date offlineTime;
    /**
     * 经销商单位信息
     */
    private SyDealerCompanyDto syDealerCompanyDto;

}
