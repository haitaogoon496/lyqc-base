package com.lyqc.contract.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/10.
 */
@Data
public class ContractListVo implements Serializable{
    private String appCode;
    private String systemCode;
    private List<ContractDetailVo> contracts;
}
