package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class LyCoreResult implements Serializable
{
    private static final long serialVersionUID = 2951301731534438089L;
    private LyCoreCarInfo lyCoreCarInfo;
    private LyCoreCarPrice lyCoreCarPrice;
    private LyCarPostResult lyCarPostResult;
    private String retCode;
    private String retMsc;
    private String contractId;

}
