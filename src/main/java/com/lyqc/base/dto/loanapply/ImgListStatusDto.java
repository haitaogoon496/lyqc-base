package com.lyqc.base.dto.loanapply;

import java.util.List;

import com.lyqc.base.common.BaseDTO;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/5/14.
 */
@Data
public class ImgListStatusDto extends BaseDTO{
    private String appCode;

    private List<ImgStatusDto> imgStatusList;

    private Integer status;

    private String statusDesc;
}
