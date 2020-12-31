package com.lyqc.receiveorder.vo.bdx;

import java.io.Serializable;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/8/30.
 */
@Data
public class DealerInfoVo implements Serializable{
    private String regCode;
    private Long dealerCode;
    private String dealerName;
    private String dealerType;
    private String dealerProvince;
    private String dealerCity;
    private Long companyCode;
    private String companyName;
    private String companyType;

}
