package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class IdentityCard implements Serializable
{
    private Long id;
    private String code;
    private String cardno;
    private String policeadd;
    private Integer valid;
    private String policeaddTwo;
    private Date createTime;
    private Integer createUser;
    private String name;
    private byte[] checkPhoto;
}
