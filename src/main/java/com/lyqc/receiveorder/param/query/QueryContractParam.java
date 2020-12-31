package com.lyqc.receiveorder.param.query;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * User: HY
 * Date: 2019/1/14
 * Time: 14:56
 * Description:
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryContractParam extends  AppCodeParam{

    //合同编码
    private String contractCode;
}
