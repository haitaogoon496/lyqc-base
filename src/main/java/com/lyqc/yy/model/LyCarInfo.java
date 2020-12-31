package com.lyqc.yy.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
public class LyCarInfo implements Serializable
{
    private static final long serialVersionUID = -1468177780361804940L;
    private Long id;
    private String appCode;
    private String carBrand;
    private String carSeries;
    private String carYear;
    private String carGearbox;
    private String carDiston;
    private String carStyles;
    private Double carNewPrice;
    private String carIdentify;
    private String engineNo;
    private String carColor;
    private String isOld;
    private Integer carMiles;
    private Date carFirstBook;
    private String carSaleName;
    private String carSaleIdno;
    private String aCarCondtion;
    private Double aCarPrice;
    private Double floatingPro;
    private Double aCarPriceChange;
    private String plateNumber;
    private Date mortgageDate;
    private Double openFare;
    private Date createTime;
    private String serialNo;

    @ApiModelProperty(name="vehicleName",value="车辆公告型号",dataType="String")
    private String vehicleName;

    /**
     * 车辆型号风控用 车型库的vehicleCode
     */
    @ApiModelProperty(name="modelId",value="车辆型号",dataType="String")
    @NotNull(message = "车辆型号不能为空")
    private String modelId;



}
