package com.lyqc.yy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CarVinResultDTO implements Serializable
{
    private static final long serialVersionUID = -4683132836449629948L;
    private Long id;
    private String brandId;
    private String seriesId;
    private String modelId;
    private String brandName;
    private String seriesName;
    private String seriesGroupName;
    private String modelName;
    private Integer modelYear;
    private Double modelPrice;
    private String modelLiter;
    private String modelGear;
    private String modelEmissionStandard;
    private Integer minRegYear;
    private Integer maxRegYear;
    private String extModelId;
    private String status;
    private String vin;
    private Date createTime;

}
