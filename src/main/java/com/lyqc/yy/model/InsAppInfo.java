package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class InsAppInfo implements Serializable
{
  private static final long serialVersionUID = 1834681507821931171L;
  private Integer id;
  private Integer paramId;
  private Long userId;
  private Long contractId;
  private String installTime;
  private String lastUpdateTime;
  private String appName;
  private Date createTime;
  private String packageName;
  private String versionName;
  private int versionCode;

}
