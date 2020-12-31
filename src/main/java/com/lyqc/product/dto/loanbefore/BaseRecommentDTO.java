package com.lyqc.product.dto.loanbefore;

import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotNull;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @description:  贷前更换资方基础DTO
 * @Date : 2019/1/18 16:45
 * @Author : 樊康康-(kangkang.fan@mljr.com)
 */
@Data
@NoArgsConstructor
public class BaseRecommentDTO implements Serializable {
    private static final long serialVersionUID = -7650405446269289781L;

    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    @NotNull(message = "[isOld]是否二手车不能为空")
    @EnumValidation(enums = ConstEnum.YesOrNoEnum.class,message = "[是否二手车]非法值，必须: {0}")
    private String isOld;
    @ApiModelProperty(name="isLcv",value="车类",dataType="String")
    @NotNull(message = "[isLcv]车类不能为空")
    @EnumValidation(enums = ConstEnum.CarTypeEnum.class,message = "[车类]非法值，必须: {0}")
    private String isLcv;
    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;
    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;
    @ApiModelProperty(name="loanPeriods",value="还款期限",dataType="String")
    @NotNull(message = "[loanPeriods]还款期限不能为空")
    @EnumValidation(enums = ConstEnum.LoanPeriodsEnum.class,message = "[还款期限]非法值，必须: {0}")
    private String loanPeriods;
    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    @NotNull(message = "[dealerCode]门店code不能为空")
    private Integer dealerCode;
    @ApiModelProperty(name="productCode",value="产品code",dataType="Integer")
    @NotNull(message = "[productCode]产品code不能为空")
    private Integer productCode;
    @ApiModelProperty(name="licenseType", value = "车牌类型(0:私牌、1:公牌、2:挂靠公牌、3:以租代购)", dataType = "String")
    @NotNull
    @EnumValidation(enums = ConstEnum.LicenceTypeEnum.class,message = "[车牌类型]非法值，必须: {0}")
    private String licenseType;
}
