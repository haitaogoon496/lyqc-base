package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.enums.SerFinConstant;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description 计算平台费DTO对象
 * 业务场景：用于单独调用
 * @Date : 2018/4/24 下午2:49
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CalcSerFinFeeDTO extends BaseDTO{

    private static final long serialVersionUID = 2537375935099820364L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    @NotNull(message = "[appCode]appCode不能为空")
    private String appCode;

    @ApiModelProperty(name="productCode",value="产品code",dataType="Integer")
    @NotNull(message = "[productCode]产品code不能为空")
    private Integer productCode;

    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    @NotNull(message = "[dealerCode]门店code不能为空")
    private Integer dealerCode;

    @ApiModelProperty(name="takenMode",value="收取方式",dataType="Integer")
    @NotNull(message = "[takenMode]收取方式不能为空")
    private Integer takenMode = SerFinConstant.TakenModeEnum.ONLINE.getIndex();

    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    @NotNull(message = "[isOld]是否二手车不能为空")
    private String isOld;

    @ApiModelProperty(name="isHouse",value="是否提供房产(已废弃)",dataType="String")
    @Deprecated
    private String isHouse;

    @ApiModelProperty(name="isLcv",value="车类",dataType="String")
    @NotNull(message = "[isLcv]车类不能为空")
    private String isLcv;

    @ApiModelProperty(name="loanPeriods",value="还款期限",dataType="String")
    @NotNull(message = "[loanPeriods]还款期限不能为空")
    private String loanPeriods;

    @ApiModelProperty(name="initScale",value="首付比",dataType="BigDecimal")
    @NotNull(message = "[initScale]首付比不能为空")
    private BigDecimal initScale;

    @ApiModelProperty(name="comRate",value="平台费率",dataType="BigDecimal")
    @NotNull(message = "[comRate]平台费率不能为空")
    private BigDecimal comRate;

    @ApiModelProperty(name="commFloatFeeRate",value="平台浮动费率",dataType="BigDecimal")
    @NotNull(message = "[commFloatFeeRate]平台浮动费率不能为空")
    private BigDecimal commFloatFeeRate = BigDecimal.ZERO;

    @ApiModelProperty(name="commFeeRate",value="平台基本费率",dataType="BigDecimal")
    @NotNull(message = "[commFeeRate]平台基本费率不能为空")
    private BigDecimal commFeeRate;

    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;
}
