package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LySale implements Serializable
{
    private static final long serialVersionUID = -6640453462342168080L;
    private Long id;
    private String appCode;
    private String saleId;
    private String saleName;
    private String saleMobile;
    private String saleBank;
    private Date saleStartWorkTime;
    private String saleSuperiorId;
    private Date createTime;
    private Date updateTime;
    private String serialNo;

}
