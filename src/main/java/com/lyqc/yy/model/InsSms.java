package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class InsSms implements Serializable
{
  private static final long serialVersionUID = -4237450859059166317L;
  private Long id;
  private Long userId;
  private String contractId;
  private String name;
  private String phoneNo;
  private String type;
  private String ctime;
  private Long duration;
  private Date createTime;
  private String content;

}
