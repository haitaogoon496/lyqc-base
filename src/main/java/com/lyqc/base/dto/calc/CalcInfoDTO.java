package com.lyqc.base.dto.calc;

import com.lyqc.base.common.BaseDTO;
import com.lyqc.base.dto.product.AppFeeInfoDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description 申请单计算上线文信息DTO对象
 * 业务场景：用于申请单费用规则校验和相关费用项引擎计算
 * @Date : 2018/4/4 上午8:53
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class CalcInfoDTO extends BaseDTO{

    private static final long serialVersionUID = 2537375935099820364L;
    @ApiModelProperty(name="appCode",value="appCode",dataType="String")
    private String appCode;

    @ApiModelProperty(name="grayTarget",value="grayTarget",dataType="Integer")
    @NotNull(message = "[grayTarget]灰度目标能为空")
    /**
     * {@link com.lyqc.base.enums.SystemCodeEnum}
     */
    private Integer grayTarget;
    /**
     * 是否灰度控制，用于通用调用方，无需灰度控制
     */
    @Deprecated
    @ApiModelProperty(name="isGray",value="isGray",dataType="boolean")
    private Boolean isGrayControl = Boolean.TRUE;
    @ApiModelProperty(name="isSubmit",value="isSubmit",dataType="boolean")
    /**
     * true:提交 false:保存
     */
    private Boolean isSubmit = Boolean.FALSE;

    @ApiModelProperty(name="productCode",value="产品code",dataType="Integer")
    @NotNull(message = "[productCode]产品code不能为空")
    private Integer productCode;

    @ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
    @NotNull(message = "[dealerCode]门店code不能为空")
    private Integer dealerCode;

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

    @ApiModelProperty(name="gpsLevel",value="GPS档位",dataType="String")
    @NotNull(message = "[gpsLevel]GPS档位不能为空")
    private String gpsLevel;

    @ApiModelProperty(name="rateLevel",value="利率档位",dataType="String")
    @NotNull(message = "[rateLevel]利率档位不能为空")
    private String rateLevel;

    @ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
    @NotNull(message = "[salePrice]实际销售价不能为空")
    private BigDecimal salePrice;

    @ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
    @NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
    private BigDecimal carLoanAmount;

    @ApiModelProperty(name="accountAmount",value="账号管理费",dataType="BigDecimal")
    @NotNull(message = "[accountAmount]账号管理费不能为空")
    private BigDecimal accountAmount;

    @ApiModelProperty(name="lifeInsuranceRate",value="人身保险费费率",dataType="BigDecimal")
    @NotNull(message = "[lifeInsuranceRate]人身保险费费率不能为空")
    private BigDecimal lifeInsuranceRate;

    @ApiModelProperty(name="loanRate",value="贷款利率",dataType="BigDecimal")
    private BigDecimal loanRate;

    @ApiModelProperty(name="comRate",value="平台费率",dataType="BigDecimal")
    @NotNull(message = "[comRate]平台费率不能为空")
    private BigDecimal comRate;

    @Deprecated
    @ApiModelProperty(name="extendId",value="延保费规则ID",dataType="Long")
    private Long extendId;

    @ApiModelProperty(name="secondYearPremiumTcId",value="第二年保险费套餐ID",dataType="Long")
    private Long secondYearPremiumTcId;

    @ApiModelProperty(name="thirdYearPremiumTcId",value="第三年保险费套餐ID",dataType="Long")
    private Long thirdYearPremiumTcId;

    @ApiModelProperty(name="appFeeInfoDTO",value="费用信息详情",dataType="AppFeeInfoDTO")
    private AppFeeInfoDTO appFeeInfoDTO;

    @ApiModelProperty(name="carInfoDTO",value="车辆信息相关DTO",dataType="CarInfoDTO")
    private CarInfoDTO carInfoDTO;

    @ApiModelProperty(name="takenMode",value = "平台费规则收取方式(已废弃)", dataType = "Integer")
    @Deprecated
    private Integer takenMode;

    @ApiModelProperty(name="notarizationFee",value = "公证费", dataType = "BigDecimal")
    private BigDecimal notarizationFee;

    @Deprecated
    @ApiModelProperty(name="isPreInterest", value = "是否收取前置总利息", dataType = "String")
    private String isPreInterest;

    @ApiModelProperty(name="isHighRisk", value = "是否是高风险产品", dataType = "Boolean")
    private Boolean isHighRisk = Boolean.FALSE;

    @ApiModelProperty(name="renewalCommissionRuleId", value = "续保押金id", dataType = "Long")
    private Long renewalCommissionRuleId;

    @ApiModelProperty(name="licenseType", value = "车牌类型(0:私牌、1:公牌、2:挂靠公牌、3:以租代购)", dataType = "String")
    private String licenseType;

    @ApiModelProperty(name="theftProtectionFee", value = "盗强险金额(已废弃，采用id进行交互)", dataType = "BigDecimal")
    @Deprecated
    private BigDecimal theftProtectionFee;

    @ApiModelProperty(name="theftProtectionId", value = "盗强险规则id", dataType = "Long")
    private Long theftProtectionId;

    /**
     * 只用于产品试算器，其它调用方不传
     * 当该值不为空时，计算车贷总额时将使用此字段值作为最终车辆保险，而非取车贷产品相应的保险计算公式计算的值。
     * 此时目标源取：  APP_CALCULATOR(12,"app-calculator","前端计算器")
     */
    @ApiModelProperty(name="secureFee", value = "车辆保险费（只用于产品试算器，其它调用方不传）", dataType = "Long")
    private BigDecimal carSecureFee;

    @ApiModelProperty(name="enjoyPackId", value = "超享包id", dataType = "Long")
    private Long enjoyPackId;
}
