package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description 计算车辆保险费DTO对象
 * 业务场景：用于计算车辆保险费和贴息
 * @Date : 2018/4/24 下午2:49
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CalcCarTaxDTO extends BaseDTO{

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

    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    @NotNull(message = "[isOld]是否二手车不能为空")
    private String isOld;

    @ApiModelProperty(name="isHouse",value="是否提供房产",dataType="String")
    @NotNull(message = "[isHouse]是否提供房产不能为空")
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

    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;

    @ApiModelProperty(name="loanAmount",value="车贷总金额",dataType="BigDecimal")
    @NotNull(message = "[loanAmount]车贷总金额不能为空")
    private BigDecimal loanAmount;

    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;

    @ApiModelProperty(name="loanRate",value="贷款利率",dataType="BigDecimal")
    @NotNull(message = "[loanRate]贷款利率不能为空")
    private BigDecimal loanRate;

    @ApiModelProperty(name="carInfoDTO",value="车辆信息相关DTO",dataType="CarInfoDTO")
    private CarInfoDTO carInfoDTO;
}
