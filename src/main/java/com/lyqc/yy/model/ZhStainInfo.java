package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class ZhStainInfo implements Serializable
{
    private static final long serialVersionUID = 7683520926902984022L;
    private Long id;
    private String dataResource;
    private Long dataResourceId;
    private String status;
    private String responseCode;
    private String responseMessage;
    private String name;
    private String idCard;
    private String checkResult;
    private String checkText;
    private String score;
    private Date createTime;
    private Integer checkCount2;
    private List<ZhStainInfoDetail> detailList;

}
