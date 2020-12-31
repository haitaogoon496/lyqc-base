package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyCoreCar implements Serializable
{
    private static final long serialVersionUID = 378312225957433430L;
    private Long id;
    private String appCode;
    private String vincode;
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
    private Double carMiles;
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
    private String modelId;
    private String cityZone;
    private String interior;
    private String surface;
    private String workState;
    private Integer transferTimes;
    private Date makeDate;
    private Date createTime;
}