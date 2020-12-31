package com.lyqc.yy.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GztBadInfoDetail implements Serializable
{
    private static final long serialVersionUID = -39231356087889084L;
    private Long id;
    private Long badInfoResultId;
    private String caseSource;
    private String caseTime;
    private Date createTime;
    private String caseType;
    private String caseLevel;

}
