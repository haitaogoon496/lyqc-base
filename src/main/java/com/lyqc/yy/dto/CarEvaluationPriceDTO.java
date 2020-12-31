package com.lyqc.yy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CarEvaluationPriceDTO implements Serializable
{
    private static final long serialVersionUID = 1914118880608757075L;
    private Long id;
    private String modelId;
    private String cityZone;
    private Date carFirstBook;
    private Double carMiles;
    private String carColor;
    private String interior;
    private String surface;
    private String workState;
    private Integer transferTimes;
    private Date makeDate;
    private Integer status;
    private String reportUrl;
    private String errorMsg;
    private Double c2bPrice;
    private Double b2bPrice;
    private Double b2cPrice;
    private Date createTime;
    private String authorizeFlag;
    private String vin;
    private String carAttribution;
    private String runFlag;

}
