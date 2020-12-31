package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class GztBadInfoResult implements Serializable
{
    private static final long serialVersionUID = 184973192379013328L;
    private GztBadInfoQuery badInfoQuery;
    private List<GztBadInfoDetail> gztBadInfoDetails;
    private ZhStainInfo zhStainInfo;
    private Long id;
    private String gztId;
    private Long queryId;
    private String idCard;
    private String code;
    private String message;
    private String checkCode;
    private String checkMsg;
    private Date createTime;
    private Integer checkCount2;


}
