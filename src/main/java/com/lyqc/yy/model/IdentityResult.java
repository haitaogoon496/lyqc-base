package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class IdentityResult implements Serializable
{
    private static final long serialVersionUID = -5611874757814477014L;
    private Long id;
    private Integer messageStatus;
    private String messageValue;
    private String cardNo;
    private String name;
    private Integer compStatus;
    private String compResulte;
    private Date createDate;
    private Integer createUser;
    private Integer abnormalFlag;

}
