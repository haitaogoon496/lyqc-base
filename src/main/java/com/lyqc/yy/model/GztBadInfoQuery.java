package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GztBadInfoQuery implements Serializable
{
    private Long id;
    private String idCard;
    private String name;
    private String status;
    private String value;
    private Date createTime;

}
