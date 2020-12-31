package com.lyqc.base.dto.product;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 产品属性规则条件DTO
 * @Date : 下午3:05 2018/4/12
 * @Author : 石冬冬-Heil Hitler(dongdong.shi@mljr.com)
 */
@Data
public class ProductProConditionDTO extends BaseDTO {
    @ApiModelProperty(name="productCode",value="productCode",dataType="Integer")
    @NotNull(message = "[productCode]productCode不能为空")
    private Integer productCode;

    private Integer dealerCode;
    /**
     * {@link com.lyqc.heil.enums.LicenceTypeEnum}
     */
    @ApiModelProperty(value = "私牌类型")
    private String licenseType;
    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    @NotNull(message = "[isOld]是否二手车不能为空")
    private String isOld;
    @ApiModelProperty(name="isHouse",value="是否提供房产(已废弃)",dataType="String")
    @Deprecated
    private String isHouse;
    @ApiModelProperty(name="isLcv",value="车类",dataType="String")
    @NotNull(message = "[isLcv]车类不能为空")
    private String isLcv;
    @ApiModelProperty(name="loanAmount",value="车贷总金额",dataType="BigDecimal")
    @NotNull(message = "[loanAmount]车贷总金额不能为空")
    private BigDecimal loanAmount;
    @ApiModelProperty(name="loanPeriods",value="还款期限",dataType="String")
    @NotNull(message = "[loanPeriods]还款期限不能为空")
    private String loanPeriods;
    @ApiModelProperty(name="initScale",value="首付比",dataType="BigDecimal")
    @NotNull(message = "[initScale]首付比不能为空")
    private BigDecimal initScale;
    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;
    @ApiModelProperty(name="carloanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carloanAmount]车辆贷款金额不能为空")
    private BigDecimal carloanAmount;
    @ApiModelProperty(name="carAge",value="车龄(月)",dataType="BigDecimal")
    @NotNull(message = "[carAge]车龄(月)不能为空")
    private BigDecimal carAge;
    @ApiModelProperty(name="course",value="车辆里程",dataType="BigDecimal")
    @NotNull(message = "[course]车辆里程不能为空")
    private BigDecimal course;

    @ApiModelProperty(name="ruleClassify",value="规则类型",dataType="Integer")
    @NotNull(message = "[ruleClassify]规则类型不能为空")
    /**
     * {@link com.lyqc.base.enums.ProductConstant.RuleClassifyEnum}
     */
    private Integer ruleClassify;
    @ApiModelProperty(name="comFlag",value="贴息计算方式",dataType="Integer")
    @NotNull(message = "[comFlag]贴息计算方式不能为空")
    /**
     * {@link com.lyqc.base.enums.ProductConstant.ComFlagEnum}
     */
    private Integer comFlag;
}