package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class InsDeviceInfo implements Serializable
{
    private static final long serialVersionUID = -5605228000223927552L;
    private Long id;
    private String caller;
    private String serialNo;
    private String productType;
    private String sourceType;
    private String userId;
    private String mobile;
    private String phoneNumber;
    private String os;
    private String deviceId;
    private String model;
    private String brand;
    private String imei;
    private String simOperator;
    private String phoneType;
    private String cellLocation;
    private String wifiIp;
    private String networkType;
    private Long currenttime;
    private Integer root;
    private Double latitude;
    private Double longitude;
    private Integer initTime;
    private Integer jailbreak;
    private String platform;
    private Date createTime;
    private String imsi;
    private String macAddress;
    private String idfa;
    private String gpsLocation;

}
