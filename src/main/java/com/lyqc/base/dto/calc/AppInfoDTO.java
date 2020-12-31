package com.lyqc.base.dto.calc;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.re.product.ProductInfoRe;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 申请单相关信息DTO
 * @Date : 下午7:29 2018/4/8
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class AppInfoDTO extends BaseDTO {
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    @NotNull(message = "[appCode]appCode不能为空")
    private String appCode;

    @ApiModelProperty(name="productInfoRe",value = "产品信息",dataType = "String")
    private ProductInfoRe productInfoRe;

    @ApiModelProperty(name="systemCode",value = "系统code",dataType = "String")
    private String systemCode;

    @ApiModelProperty(name="isSubmit",value="是否提交",dataType="Integer")
    @NotNull(message = "[isSubmit]是否提交不能为空")
    /**
     * 1:提交订单  0:保存订单
     */
    private Integer isSubmit;
    @ApiModelProperty(name="isQnewCarProduct",value="产品是否是准新车产品",dataType="Integer")
    @NotNull(message = "[isQnewCarProduct]是否提交不能为空")
    /**
     * 判断当前选择产品是否是准新车产品（暂时只有渠道有）
     */
    private Integer isQnewCarProduct;

    @ApiModelProperty(name="gpsFloatEnable",value="是否支持GPS金额自主配置",dataType="Boolean")
    private Boolean gpsFloatEnable = Boolean.FALSE;

    @ApiModelProperty(name="gpsFloatFeeMin",value="自主配置GPS最小金额(含)(NULL或-1标识无限制)",dataType="BigDecimal")
    private BigDecimal gpsFloatFeeMin;

    @ApiModelProperty(name="gpsFloatFeeMax",value="自主配置GPS最大金额(含)(NULL或-1标识无限制)",dataType="BigDecimal")
    private BigDecimal gpsFloatFeeMax;

    @ApiModelProperty(name="commFloatFeeEnable",value="是否支持平台费自主金额比例",dataType="Boolean")
    private Boolean commFloatFeeEnable = Boolean.FALSE;

    @ApiModelProperty(name="commFloatFeeRateMin",value="平台费自主金额最小比例(含)(NULL或-1标识无限制)",dataType="BigDecimal")
    private BigDecimal commFloatFeeRateMin;

    @ApiModelProperty(name="commFloatFeeRateMax",value="平台费自主金额最小比例(含)(NULL或-1标识无限制)",dataType="BigDecimal")
    private BigDecimal commFloatFeeRateMax;

    @ApiModelProperty(name="prop",value="产品属性表map字段",dataType="Boolean")
    private Map<String, Object> prop = new HashMap<>();
}
