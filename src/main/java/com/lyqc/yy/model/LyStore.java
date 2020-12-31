package com.lyqc.yy.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyStore implements Serializable
{
    private static final long serialVersionUID = 6981130122569788343L;
    private Long id;
    private String appCode;
    private String dealerType;
    private String saleArea;
    private String saleArea2;
    private String companyName4;
    private String province4;
    private String city4;
    private String contactPerson;
    private String tel;
    private String isVip;
    private String onlineTime;
    private String flowSeq;
    private String dealerCompanyCode;
    private Date createTime;
    private String serialNo;


    @ApiModelProperty(name="belongDealer",value="所属门店id",dataType="String")
    private String belongDealer;

    @ApiModelProperty(name="belongDealerName",value="所属门店名称",dataType="String")
    private String belongDealerName;

    @ApiModelProperty(name="belongOperation",value="所属运营id",dataType="String")
    private String belongOperation;

    @ApiModelProperty(name="belongOperationName",value="所属运营名称",dataType="String")
    private String belongOperationName;

    @ApiModelProperty(name="belongMarket",value="所属市场id",dataType="String")
    private String belongMarket;

    @ApiModelProperty(name="belongMarketName",value="所属市场名称",dataType="String")
    private String belongMarketName;
}
