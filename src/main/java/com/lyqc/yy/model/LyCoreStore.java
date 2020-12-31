package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class LyCoreStore implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String appCode;
    private String dealerType;
    private String saleArea;
    private Date createTime;

}
