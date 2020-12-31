package com.lyqc.base.re.product;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @description: 延保费适用产品配置Re
 * @Date : 上午11:32 2017/12/14
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class YbtcApplyProductRe implements Serializable {
    /**
     * 第二年保险费适用产品id
     */
    @ApiModelProperty(name="ybtc3Pids",value="支持第二年保险费的相关产品id",dataType="List<Integer>")
    private List<Integer> ybtc2Pids;
    /**
     * 第三年保险费适用产品id
     */
    @ApiModelProperty(name="ybtc3Pids",value="支持第三年保险费的相关产品id",dataType="List<Integer>")
    private List<Integer> ybtc3Pids;
}
