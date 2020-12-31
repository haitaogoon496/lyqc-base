package com.lyqc.yy.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class LyLinkFaceDTO implements Serializable
{
  private static final long serialVersionUID = 6104254320709328844L;
  private Integer flowIdentifier;
  private String selfieUrl;
  private String idCardExpiry;
  private String selfieBinaryUrl;
  private String historicalSelfieUrl;

}
