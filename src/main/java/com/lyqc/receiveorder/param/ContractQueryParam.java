package com.lyqc.receiveorder.param;

import java.util.List;

import lombok.Data;

/**
 * Created by xiaoxian on 2018/7/10.
 */
@Data
public class ContractQueryParam extends BaseReiveorderParam{
    private String appCode;
    private List<String> contractKeyList;
    private String systemCode;
}
