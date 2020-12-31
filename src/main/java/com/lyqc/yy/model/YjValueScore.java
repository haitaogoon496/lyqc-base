package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class YjValueScore implements Serializable
{
    private static final long serialVersionUID = 3281989965390445242L;
    private ZhStainInfo zhStainInfo;
    private Long id;
    private String name;
    private String idcard;
    private String result;
    private String resultText;
    private String responseText;
    private String responseCode;
    private String score;
    private Date createTime;
}