package com.lyqc.contract.param;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/11.
 */
@Data
public class EleContractQueryParam implements Serializable{
    private String appCode;
    private List<String> contractKeyList;
    private String systemCode;
}
