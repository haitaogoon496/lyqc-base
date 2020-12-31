package com.lyqc.base.re.product;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName:
 * @Description: 产品相关费用
 * @author: kangkang.fan
 * @date: 2018年3月23日 上午10:21:47
 */
public class ProductPropsRe implements Serializable {

    private static final long serialVersionUID = 2972266872558141562L;

    public static final BigDecimal DISABLE = new BigDecimal("-1.00");

    @ApiModelProperty(name="gpsFloatEnable",value = "是否支持GPS金额自主配置",dataType = "Boolean")
    private Boolean gpsFloatEnable = Boolean.FALSE;

    @ApiModelProperty(name="gpsFloatFeeMin",value = "自主配置GPS最小金额(含)(NULL或-1标识无限制)",dataType = "BigDecimal")
    private BigDecimal gpsFloatFeeMin = DISABLE;

    @ApiModelProperty(name="gpsFloatFeeMax",value = "自主配置GPS最大金额(含)(NULL或-1标识无限制)",dataType = "BigDecimal")
    private BigDecimal gpsFloatFeeMax = DISABLE;

    @ApiModelProperty(name="commFloatFeeEnable",value = "是否支持平台费自主金额比例",dataType = "Boolean")
    private Boolean commFloatFeeEnable = Boolean.FALSE;

    @ApiModelProperty(name="commFloatFeeRateMin",value = "平台费自主金额最小比例(含)(NULL或-1标识无限制)",dataType = "BigDecimal")
    private BigDecimal commFloatFeeRateMin = DISABLE;

    @ApiModelProperty(name="commFloatFeeRateMax",value = "平台费自主金额最小比例(含)(NULL或-1标识无限制)",dataType = "BigDecimal")
    private BigDecimal commFloatFeeRateMax = DISABLE;

    private Map<String, Object> prop = new HashMap<>();


    public Boolean getGpsFloatEnable() {
        return gpsFloatEnable == null ? false : gpsFloatEnable;
    }

    public void setGpsFloatEnable(Boolean gpsFloatEnable) {
        this.gpsFloatEnable = gpsFloatEnable;
    }

    public BigDecimal getGpsFloatFeeMin() {
        return gpsFloatFeeMin;
    }

    public void setGpsFloatFeeMin(BigDecimal gpsFloatFeeMin) {
        this.gpsFloatFeeMin = gpsFloatFeeMin;
    }

    public BigDecimal getGpsFloatFeeMax() {
        return gpsFloatFeeMax;
    }

    public void setGpsFloatFeeMax(BigDecimal gpsFloatFeeMax) {
        this.gpsFloatFeeMax = gpsFloatFeeMax;
    }

    public Boolean getCommFloatFeeEnable() {
        return commFloatFeeEnable == null ? false : commFloatFeeEnable;
    }

    public void setCommFloatFeeEnable(Boolean commFloatFeeEnable) {
        this.commFloatFeeEnable = commFloatFeeEnable;
    }

    public BigDecimal getCommFloatFeeRateMin() {
        return commFloatFeeRateMin;
    }

    public void setCommFloatFeeRateMin(BigDecimal commFloatFeeRateMin) {
        this.commFloatFeeRateMin = commFloatFeeRateMin;
    }

    public BigDecimal getCommFloatFeeRateMax() {
        return commFloatFeeRateMax;
    }

    public void setCommFloatFeeRateMax(BigDecimal commFloatFeeRateMax) {
        this.commFloatFeeRateMax = commFloatFeeRateMax;
    }

    public Map<String, Object> getProp() {
        return prop;
    }

    public void setProp(Map<String, Object> prop) {
        this.prop = prop;
    }
}
