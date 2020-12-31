package com.lyqc.yy.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CheckResultDTO implements Serializable
{
    private String checkItem;
    private String checkObject;
    private String checkWorkflow;
    private String checkResult;
    private String checkExceptionReason;
    private String checkRemark;
    private Date checkTime;
    private String checkUser;

}
