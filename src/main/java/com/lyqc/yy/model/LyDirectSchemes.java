package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LyDirectSchemes implements Serializable
{
  private static final long serialVersionUID = -8178496966039506023L;
  private Long id;
  private String appCode;
  private String serinalNo;
  private Date createTime;
  private String idnoRepayment;
  private String bankReservedPhone;
  private BigDecimal rentDownpaymentRate;
  private BigDecimal rentDownpayment;
  private BigDecimal rentMonthrent;
  private Integer rentTencancy;
  private BigDecimal rentResidualvalue;

}