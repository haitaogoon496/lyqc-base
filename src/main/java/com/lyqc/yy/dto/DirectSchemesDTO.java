package com.lyqc.yy.dto;

import com.lyqc.yy.model.LyDirectSchemes;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DirectSchemesDTO implements Serializable
{
    private static final long serialVersionUID = -7287439594139110933L;
    private String serinalNo;
    private String appCode;
    private String idnoRepayment;
    private String bankReservedPhone;
    private List<LyDirectSchemes> listDirectSchemes;

}

