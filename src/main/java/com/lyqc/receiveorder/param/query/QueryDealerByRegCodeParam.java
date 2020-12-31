package com.lyqc.receiveorder.param.query;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class QueryDealerByRegCodeParam {
    private Long regCode;
}
