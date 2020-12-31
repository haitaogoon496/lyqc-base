package com.lyqc.base.dto.loanapply;

import com.lyqc.base.common.BaseDTO;

import lombok.Data;

/**
 * 图片状态
 * Created by xiaoxian on 2018/5/14.
 */
@Data
public class ImgStatusDto extends BaseDTO{
    private static final long serialVersionUID = 2631762923452068932L;

    private String appCode;

    private String imgKey;

    private Integer status;

    private String statusDesc;
}
