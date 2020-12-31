package com.lyqc.receiveorder.param.bdx;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.lyqc.receiveorder.param.BaseEnterInParam;

import lombok.Data;

/**
 * 秒拒提交参数
 * 是simba秒拒通过后提交的，目的是将纸质征信订单过人工初审
 */
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BdxSecondParam extends BaseEnterInParam {
    private BdxSecondProppserParam proppersParam;


}
