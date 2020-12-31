package com.lyqc.receiveorder.param.query;

import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseReiveorderParam;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryDealerByRegCodesParam extends BaseReiveorderParam {
    private List<Long> regCodeList;
}
