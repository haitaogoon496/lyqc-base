package com.lyqc.base.dto.product;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

import java.math.BigDecimal;

/**
 * @description: 产品规则 DTO
 * @Date : 2018/3/4 下午6:34
 * @Author : 石冬冬-Seig Heil(dongdong.shi@mljr.com)
 */
@Data
public class ProductRuleDTO extends BaseDTO {
	@ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
	@NotEmpty(message = "[isOld]是否二手车不能为空")
	private String isOld;
	@ApiModelProperty(name="isHouse",value="是否提供房产",dataType="String")
	@NotEmpty(message = "[isHouse]是否提供房产不能为空")
	private String isHouse;
	@ApiModelProperty(name="isLcv",value="车类",dataType="String")
	@NotEmpty(message = "[isLcv]车类不能为空")
	private String isLcv;
	@ApiModelProperty(name="carLoanAmount",value="车辆贷款金额",dataType="BigDecimal")
	@NotNull(message = "[carLoanAmount]车辆贷款金额不能为空")
	private BigDecimal carLoanAmount;
	@ApiModelProperty(name="loanPeriods",value="还款期限",dataType="String")
	@NotEmpty(message = "[loanPeriods]还款期限不能为空")
	private String loanPeriods;
	@ApiModelProperty(name="initScale",value="首付比",dataType="BigDecimal")
	@NotNull(message = "[initScale]首付比不能为空")
	private BigDecimal initScale;
	@ApiModelProperty(name="dealerCode",value="门店code",dataType="Integer")
	private Integer dealerCode;
	@ApiModelProperty(name="productCode",value="产品code",dataType="Integer")
	@NotNull(message = "[productCode]产品code不能为空")
	private Integer productCode;
	@ApiModelProperty(name="appCode",value="申请单号",dataType="String")
	private String appCode;
	/**
	 * 适用于[利率规则配置]此时该字段非空,否则为空即可
	 */
	@ApiModelProperty(name="rateLevel",value="利率档位",dataType="String")
	private String rateLevel;

	/**
	 {@link com.lyqc.base.enums.ProductConstant.YbtcClassifyEnum,com.lyqc.base.enums.ProductConstant.FeeRuleClassifyEnum}
	 */
	@ApiModelProperty(name="classify",value="延保费类别",dataType="String")
	private Integer classify;

	@ApiModelProperty(name="gpsLevel",value="gps档位",dataType="String")
	private String gpsLevel;
	/**
	 * 查询平台费规则使用
	 */
	@ApiModelProperty(name="workflow",value="workflow",dataType="String")
	private String workflow;

	@ApiModelProperty(name="loanAmount",value="车辆贷款金金额（此字段只是为了兼容旧调用者，新的请使用carLoanAmount字段）",dataType="BigDecimal")
	private BigDecimal loanAmount;

	@ApiModelProperty(name="licenseType", value = "车牌类型(0:私牌、1:公牌、2:挂靠公牌、3:以租代购)", dataType = "String")
	private String licenseType;

	@ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
	private BigDecimal salePrice;

	@ApiModelProperty(name="carAge",value="车龄(月)",dataType="BigDecimal")
	private BigDecimal carAge;

	@ApiModelProperty(name="course",value="车辆里程",dataType="BigDecimal")
	private BigDecimal course;

	/**
	 * comRate, 为 lyqc-cas 提供
	 */
	@ApiModelProperty(name="comRate", value="comRate", dataType="BigDecimal")
	private BigDecimal comRate;

}
