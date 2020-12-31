package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class InsAddressBook implements Serializable
{
    private static final long serialVersionUID = 8876621627556674456L;
    private Integer id;
    private Integer paramId;
    private Long userId;
    private String contractId;
    private String name;
    private String number;
    private Date createTime;

}
