package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description: 产品费用规则接口
 * 业务场景：主要提供给APP选择 GPS档位 和 利率档位 DTO对象
 * @Date : 2018/7/4 下午5:18
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class FeeRuleDTO extends BaseDTO {
    private static final long serialVersionUID = 1626611818475296265L;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    @NotEmpty(message = "[isOld]是否二手车不能为空")
    @EnumValidation(enums = ConstEnum.YesOrNoEnum.class,message = "[是否二手车]非法值，必须({0})")
    private String isOld;
    @ApiModelProperty(name="isLcv",value="车类",dataType="String")
    @NotEmpty(message = "[isLcv]车类不能为空")
    @EnumValidation(enums = ConstEnum.CarTypeEnum.class,message = "[车类]非法值，必须({0})")
    private String isLcv;
    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;
    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;
    @ApiModelProperty(name="loanPeriods",value="还款期限",dataType="String")
    @NotEmpty(message = "[loanPeriods]还款期限不能为空")
    @EnumValidation(enums = ConstEnum.LoanPeriodsEnum.class,message = "[还款期限]非法值，必须({0})")
    private String loanPeriods;
    @ApiModelProperty(name="dealerCode",value="经销商门店code",dataType="Integer")
    @NotNull(message = "[dealerCode]经销商门店code不能为空")
    private Integer dealerCode;
    @ApiModelProperty(name="productCode",value="金融产品code",dataType="Integer")
    @NotNull(message = "[productCode]金融产品code不能为空")
    private Integer productCode;
}
