package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class InsCallRecord implements Serializable
{
  private static final long serialVersionUID = 1900757385694889087L;
  private Integer id;
  private Integer paramId;
  private Long userId;
  private String contractId;
  private String name;
  private String number;
  private String type;
  private String callTime;
  private String duration;
  private Date createTime;

}
