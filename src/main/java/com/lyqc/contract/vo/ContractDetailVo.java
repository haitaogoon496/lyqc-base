package com.lyqc.contract.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/10.
 */
@Data
public class ContractDetailVo implements Serializable{
    private String appCode;

    private String contractKey;

    private String contractName;

    private String contractStatus;

    private String url;

    private String imgKey;

    private Date createTime;
}
