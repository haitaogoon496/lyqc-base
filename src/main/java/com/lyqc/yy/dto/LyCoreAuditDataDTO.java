package com.lyqc.yy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class LyCoreAuditDataDTO implements Serializable
{
    private String appCode;
    private List<CheckResultDTO> listCheckResultDTO;

}
