package com.lyqc.product.dto;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.common.validation.EnumValidation;
import com.lyqc.product.enums.ConstEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 产品规则接口
 * @Date : 2018/7/4 下午5:18
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
@NoArgsConstructor
public class ProductRuleDTO extends BaseDTO {
    private static final long serialVersionUID = 7543333371373679855L;
    @ApiModelProperty(name="appCode",value="申请单号",dataType="String")
    private String appCode;
    @ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
    @NotEmpty(message = "[isOld]是否二手车不能为空")
    @EnumValidation(enums = ConstEnum.YesOrNoEnum.class,message = "[是否二手车]非法值，必须(0/1)")
    private String isOld;
    @ApiModelProperty(name="isHouse",value="是否提供房产(已废弃)",dataType="String")
    @EnumValidation(enums = ConstEnum.YesOrNoEnum.class,message = "[是否提供房产]非法值，必须(0/1)")
    @Deprecated
    private String isHouse;
    @ApiModelProperty(name="isLcv",value="车类",dataType="String")
    @NotEmpty(message = "[isLcv]车类不能为空")
    @EnumValidation(enums = ConstEnum.CarTypeEnum.class,message = "[车类]非法值，必须(0/1/2/3)")
    private String isLcv;
    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;
    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;
    @ApiModelProperty(name="loanPeriods",value="还款期限",dataType="String")
    @NotEmpty(message = "[loanPeriods]还款期限不能为空")
    @EnumValidation(enums = ConstEnum.LoanPeriodsEnum.class,message = "[还款期限]非法值，必须(6/12/18/24/36/42/48)")
    private String loanPeriods;
    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    private Integer dealerCode;
    @ApiModelProperty(name="productCode",value="产品code",dataType="Integer")
    @NotNull(message = "[productCode]产品code不能为空")
    private Integer productCode;
    @ApiModelProperty(name="rateLevel",value="利率档位",dataType="String")
    private String rateLevel;
    @ApiModelProperty(name="gpsLevel",value="gps档位",dataType="String")
    private String gpsLevel;
    @ApiModelProperty(name="licenseType", value = "车牌类型(0:私牌、1:公牌、2:挂靠公牌、3:以租代购)", dataType = "String")
    @EnumValidation(enums = ConstEnum.LicenceTypeEnum.class,message = "[车牌类型]非法值，必须(0/1/2/3)")
    private String licenseType;
    @ApiModelProperty(name="carAge",value="车龄(月)",dataType="BigDecimal")
    private BigDecimal carAge;
    @ApiModelProperty(name="course",value="车辆里程",dataType="BigDecimal")
    private BigDecimal course;
}
