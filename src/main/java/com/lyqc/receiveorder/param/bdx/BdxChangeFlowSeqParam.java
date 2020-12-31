package com.lyqc.receiveorder.param.bdx;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.query.AppCodeParam;

import lombok.Data;

/**
 * @Author: xiaoxian
 * @Date: 2019/3/11 15:06
 * @Version
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxChangeFlowSeqParam extends AppCodeParam {
    private Long flowSeq;
}
