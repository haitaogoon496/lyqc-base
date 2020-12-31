package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ZhStainInfoDetail implements Serializable
{
    private static final long serialVersionUID = -7112523345827405162L;
    private Long id;
    private Long infoId;
    private String caseSource;
    private String caseTime;
    private Date createTime;
    private String caseType;
    private String caseLevel;

}
