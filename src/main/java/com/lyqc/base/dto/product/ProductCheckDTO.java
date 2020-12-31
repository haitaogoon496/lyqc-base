package com.lyqc.base.dto.product;

import java.math.BigDecimal;

import com.lyqc.base.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import net.sf.oval.constraint.NotNull;

/**
 * @description: 产品规则 DTO 用于校验金融产品要求
 * @Date : 2018/4/8
 * @Author : xiaoxian
 */
@Data
public class ProductCheckDTO extends BaseDTO {
	@ApiModelProperty(name="dealerCode",value="门店code",dataType="String")
	private Integer dealerCode;
	@ApiModelProperty(name="productCode",value="产品code",dataType="String")
	@NotNull(message = "[productCode]产品code不能为空")
	private Long productCode;
	@ApiModelProperty(name="appCode",value="申请单号",dataType="String")
	private String appCode;

	@ApiModelProperty(name="salePrice",value="实际销售价",dataType="BigDecimal")
	private BigDecimal salePrice;

	@ApiModelProperty(name="carloanAmount",value="车辆贷款金额",dataType="String")
	private BigDecimal carloanAmount;

	@ApiModelProperty(name="loanAmount",value="总贷款金额",dataType="String")
	@NotNull(message = "[loanAmount]总贷款金额不能为空")
	private BigDecimal loanAmount;

	@ApiModelProperty(name="initScale",value="首付比",dataType="String")
	@NotNull(message = "[initScale]首付比不能为空")
	private BigDecimal initScale;

	@ApiModelProperty(name="carAge",value="车龄",dataType="Integer")
	private Integer carAge;

	@ApiModelProperty(name="course",value="行驶里程",dataType="Integer")
	private Integer course;

	@ApiModelProperty(name="isOld",value="是否二手车",dataType="String")
	@NotNull(message = "[isOld]是否二手车不能为空")
	private String isOld;

	@ApiModelProperty(name="isHouse",value="是否提供房产(已废弃)",dataType="String")
	@Deprecated
	private String isHouse;

	@ApiModelProperty(name="isLcv",value="车类",dataType="String")
	@NotNull(message = "[isLcv]车类不能为空")
	private String isLcv;

	@ApiModelProperty(name="loanPeriods",value="贷款期限",dataType="String")
	@NotNull(message = "[loanPeriods]贷款期限不能为空")
	private String loanPeriods;
}
